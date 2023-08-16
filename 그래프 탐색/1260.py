import sys
from collections import deque

n,m,v=map(int,sys.stdin.readline().split())

graph=[[False]*(n+1) for i in range(n+1)]

for i in range(m):
    a,b=map(int,sys.stdin.readline().split())
    graph[a][b]=True
    graph[b][a]=True

visited1=[False]*(n+1)
visited2=[False]*(n+1)

def dfs(v):
    visited1[v]=True
    print(v, end=' ')
    for i in range(1,n+1):
        if not visited1[i] and graph[v][i]:
            dfs(i)

def bfs(v):
    q=deque([v])
    visited2[v]=True
    while q:
        v=q.popleft()
        print(v, end=' ')
        for i in range(1,n+1):
            if not visited2[i] and graph[v][i]:
                q.append(i)
                visited2[i]=True

dfs(v)
print()
bfs(v)