import sys
import heapq

n=int(sys.stdin.readline())
problem=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]

problem.sort()

queue=[]
for i in problem:
    heapq.heappush(queue,i[1])
    if i[0]<len(queue):
        heapq.heappop(queue)

print(sum(queue))