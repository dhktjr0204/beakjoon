import sys
import heapq

n,m=map(int,sys.stdin.readline().split())
INF=int(1e9)
distance=[INF]*(n+1)
graph=[[]*(n+1) for _ in range(n+1)]
for _ in range(m):
    a,b=map(int,sys.stdin.readline().split())
    graph[a].append((b,1))
    graph[b].append((a,1))
q=[(0,1)]
distance[1]=0
while q:
    dist,x=heapq.heappop(q)
    if distance[x]<dist:
        continue
    for i in graph[x]:
        cost=i[1]+dist
        if cost<distance[i[0]]:
            distance[i[0]]=cost
            heapq.heappush(q,(cost,i[0]))

max_node=0
max_distance=0
result=[]
for i in range(1,n+1):
    if max_distance<distance[i]:
        max_node=i #큰 수 중 제일 작은 노드 저장
        max_distance=distance[i]
        result=[max_node] #더 큰 수가 있으면 result 초기화
    elif max_distance==distance[i]:
        result.append(i)

print(max_node, max_distance, len(result))



    