import sys
import heapq

n,k=map(int,sys.stdin.readline().split())
jewel=[]
for _ in range(n):
    heapq.heappush(jewel, list(map(int,sys.stdin.readline().split())))
bags=[int(sys.stdin.readline()) for _ in range(k)]
bags.sort()

answer=0
tmp_jew=[]

for bag in bags:
    #만약 가방의 무게보다 보석의 무게가 작다면
    while jewel and bag>=jewel[0][0]:
        #가격 낮은 순으로 정렬하기 위해 -를 씀
        heapq.heappush(tmp_jew,-heapq.heappop(jewel)[1])
    if tmp_jew:
        answer-=heapq.heappop(tmp_jew)
    elif not jewel:
        break
print(answer)