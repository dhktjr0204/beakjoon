import sys
from collections import deque

n,m=map(int, sys.stdin.readline().split())
maze=[list(map(int,sys.stdin.readline().strip())) for _ in range(n)]

dy=[-1,0,1,0]
dx=[0,-1,0,1]

def find_maze(x,y):
    queue=deque()
    queue.append((x,y))
    while queue:
        y,x=queue.popleft() 

        for i in range(4):
            ny=y+dy[i]
            nx=x+dx[i]
            if not 0<=ny<n or not 0<=nx<m:
                continue
            
            if maze[ny][nx]==1:
                maze[ny][nx]=maze[y][x]+1
                queue.append((ny,nx))
    return maze[n-1][m-1]

print(find_maze(0,0))
