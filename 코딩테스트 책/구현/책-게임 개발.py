import sys
from collections import deque
n,m=map(int,sys.stdin.readline().split())
a,b,d=map(int,sys.stdin.readline().split())
matrix=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]

visited=[[False]*m for _ in range(n)]

dy=[-1,0,1,0]
dx=[-0,1,0,-1]
visited[a][b]=True
cnt=1
while True:
    flag=0
    for i in range(4):
        ny=a+dy[(d+3)%4]
        nx=b+dx[(d+3)%4]
        d=(d+3)%4
        if 0<=ny<n and 0<nx<m:
            if not visited[ny][nx] and matrix[ny][nx]==0:
                flag=1
                visited[ny][nx]=True
                a,b=ny,nx
                cnt+=1
                break
    if flag==0:
        ny=a-dy[d]
        nx=b-dx[d]
        if matrix[ny][nx]==1:
            print(cnt)
            break
        else:
            a,b=ny,nx

