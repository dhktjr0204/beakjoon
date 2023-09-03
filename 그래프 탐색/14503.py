import sys
from collections import deque

n,m=map(int, sys.stdin.readline().split())

x,y,d=map(int, sys.stdin.readline().split())

room=[]

for i in range(n):
    room.append(list(map(int, sys.stdin.readline().split())))

visited=[[0]*m for _ in range(n)]
visited[x][y]=1
cnt=1

dx=[-1,0,1,0]
dy=[0,1,0,-1]

while True:
    flag=0
    for i in range(4):
        nx=x+dx[(d+3)%4]
        ny=y+dy[(d+3)%4]
        d=(d+3)%4
        if 0<=nx<n and 0<=ny<m and room[nx][ny]==0:
            if visited[nx][ny]==0:
                visited[nx][ny]=1
                cnt+=1
                x=nx
                y=ny
                flag=1
                break
    if flag==0:
        if room[x-dx[d]][y-dy[d]]==1:
            print(cnt)
            break
        else:
            x,y=x-dx[d],y-dy[d]

    

        