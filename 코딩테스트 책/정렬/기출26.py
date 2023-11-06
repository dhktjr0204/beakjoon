import sys
import heapq

n=int(sys.stdin.readline())
card=[]
for i in range(n):
    num=int(sys.stdin.readline())
    heapq.heappush(card,num)

result=0

#원소가 1개 남을 때 까지
while len(card)!=1:
    one=heapq.heappop(card)
    two=heapq.heappop(card)
    sum_value=one+two
    result+=sum_value
    heapq.heappush(card,sum_value)
print(result)
