import sys
from collections import deque

n=int(sys.stdin.readline())
m=int(sys.stdin.readline())

visited=[False]*(n+1)
graph=[[False]*(n+1) for _ in range(n+1)]

for i in range(m):
    a,b=map(int, sys.stdin.readline().split())
    graph[a][b]=True
    graph[b][a]=True

virus=[]

def bfs(v):
    q=deque([v])
    visited[v]=True
    while q:
        v=q.popleft()
        for i in range(1,n+1):
            if not visited[i] and graph[v][i]:
                visited[i]=True
                q.append(i)
                virus.append(i)
    print(len(virus))

bfs(1)

    