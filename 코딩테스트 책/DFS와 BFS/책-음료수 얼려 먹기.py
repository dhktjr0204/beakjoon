import sys

n,m=map(int,sys.stdin.readline().split())
matrix=[sys.stdin.readline() for _ in range(n)]
visited=[[False]*m for _ in range(n)]

dy=[-1,0,1,0]
dx=[0,-1,0,1]

def dfs(y,x):
    visited[y][x]=True
    for i in range(4):
        ny=y+dy[i]
        nx=x+dx[i]
        if 0<=ny<n and 0<=nx<m:
            if matrix[ny][nx]=='0' and not visited[ny][nx]:
                dfs(ny,nx)

cnt=0
for i in range(n):
    for j in range(m):
        if not visited[i][j] and matrix[i][j]=='0':
            dfs(i,j)
            cnt+=1

print(cnt)