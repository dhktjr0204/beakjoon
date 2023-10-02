import sys

n,m=map(int,sys.stdin.readline().split())
INF=99999
graph=[[INF]*(n+1) for _ in range(n+1)]
for i in range(m):
    a,b=map(int,sys.stdin.readline().split())
    graph[a][b]=1
    graph[b][a]=1

for i in range(1,n+1):
    graph[i][i]=0

x,k=map(int,sys.stdin.readline().split())

for p in range(1,n+1):
    for a in range(1,n+1):
        for b in range(1,n+1):
            graph[a][b]=min(graph[a][b], graph[a][p]+graph[p][b])

distance=graph[1][k]+graph[k][x]
if distance>=INF:
    print(-1)
else:
    print(distance)