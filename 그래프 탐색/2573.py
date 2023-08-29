import sys
from collections import deque

n,m=map(int, sys.stdin.readline().split())

graph=[list(map(int, sys.stdin.readline().split())) for _ in range(n)]

dy=[-1,0,1,0]
dx=[0,-1,0,1]

def bfs(y,x):
    q=deque([(y,x)])
    visited[y][x]=1
    while q:
        y,x=q.popleft()
        sea=0
        for i in range(4):
            ny=y+dy[i]
            nx=x+dx[i]
            if 0<=ny<n and 0<=nx<m:
                if graph[ny][nx]==0:
                    cnt[y][x]+=1
                elif graph[ny][nx] and not visited[ny][nx]:
                    q.append((ny,nx))
                    visited[ny][nx]=1
    return 1

year=0
while True:
    visited=[[0]*m for _ in range(n)]
    cnt=[[0]*m for _ in range(n)]
    answer=[]

    for i in range(n):
        for j in range(m):
            if graph[i][j]!=0 and not visited[i][j]:
                answer.append(bfs(i,j))
    for i in range(n):
        for j in range(m):
            graph[i][j]-=cnt[i][j]
            if graph[i][j]<0:
                graph[i][j]=0
    if len(answer)==0 or len(answer)>=2:
        break
    year+=1

if len(answer)>=2:
    print(year)
else:
    print(0)