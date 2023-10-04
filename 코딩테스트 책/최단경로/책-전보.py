import sys
import heapq

n,m,c=map(int,sys.stdin.readline().split())
graph=[[] for _ in range(n+1)]
INF=99999
distance=[INF]*(n+1)
for _ in range(m):
    a,b,d=map(int,sys.stdin.readline().split())
    graph[a].append((b,d))

def dijkstra(start):
    q=[]
    heapq.heappush(q,(0,start))
    distance[start]=0
    while q:
        dist,now=heapq.heappop(q)
        if dist<distance[now]:
            continue
        for i in graph[now]:
            cost=dist+i[1]
            if cost<distance[i[0]]:
                distance[i[0]]=cost
                heapq.heappush(q,(cost,i[0]))

dijkstra(c)
cnt=0
result=0
for i in distance:
    if i!=INF:
        cnt+=1
        result=max(result,i)

print(cnt-1, result)