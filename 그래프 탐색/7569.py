import sys
from collections import deque

m,n,h=map(int,sys.stdin.readline().split())

storage=[[list(map(int, sys.stdin.readline().split())) for _ in range(n)] for _ in range(h)]
visited = [[[False]*m for _ in range(n)] for _ in range(h)]
q=deque()

dz=[-1,1,0,0,0,0]
dy=[0,0,-1,1,0,0]
dx=[0,0,0,0,-1,1]


def find_harvest():
    while q:
        z,y,x=q.popleft()
        for i in range(6):
            nz=z+dz[i] 
            ny=y+dy[i]
            nx=x+dx[i]
   
            if not 0<=nz<h or not 0<=ny<n or not 0<=nx<m:
                continue

            if storage[nz][ny][nx]==0 and not visited[nz][ny][nx]:
                storage[nz][ny][nx]=storage[z][y][x]+1
                q.append((nz,ny,nx))
                visited[nz][ny][nx]=True

for a in range(h):
    for b in range(n):
        for c in range(m):
            if storage[a][b][c]==1 and not visited[a][b][c]:
                q.append((a,b,c))
                visited[a][b][c]=True

find_harvest()
            
day=0
for i in storage:
    for j in i:
        for k in j:
            if k==0:
                print(-1)
                exit(0)
        day=max(day,max(j))

print(day-1)





