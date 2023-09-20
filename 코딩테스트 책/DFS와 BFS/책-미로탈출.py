import sys
from collections import deque
n,m=map(int,sys.stdin.readline().split())
matrix=[list(map(int,sys.stdin.readline().rstrip())) for _ in range(n)]
visited=[[False]*m for _ in range(n)]

dy=[-1,0,1,0]
dx=[0,-1,0,1]

def bfs():
    q=deque()
    q.append((0,0))
    visited[0][0]=True
    while q:
        y,x=q.popleft()
        for i in range(4):
            ny=y+dy[i]
            nx=x+dx[i]
            if 0<=ny<n and 0<=nx<m:
                if not visited[ny][nx] and matrix[ny][nx]==1:
                    visited[ny][nx]=True
                    matrix[ny][nx]=matrix[y][x]+1
                    q.append((ny,nx))
    print(matrix[n-1][m-1])

bfs()