import sys
from collections import deque

#인구 차이가 l명 이상 r명 이하
n,l,r=map(int,sys.stdin.readline().split())
country=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]

dx=[-1,0,1,0]
dy=[0,-1,0,1]

def bfs(x,y):
    q = deque()
    union = []
    q.append((x, y))
    union.append((x, y))
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx and nx<n and 0<=ny and ny<n and visited[ny][nx]==0:
                if l<=abs(country[x][y]-country[nx][ny])<=r:
                    visited[nx][ny] = 1
                    q.append((nx, ny))
                    union.append((nx, ny))
    return union

day=0
while True:
    visited = [[0 for _ in range(n)] for _ in range(n)]
    flag = 0
    for i in range(n):
        for j in range(n):
            if visited[i][j]==0:
                visited[i][j]==1
                union_country=bfs(i,j)
                if len(union_country)>1:
                    flag=1
                    result=sum(country[x][y] for x,y in union_country)//len(union_country)
                    for x,y in union_country:
                        country[x][y]=result
    if flag==0:
        print(day)
        break
    day+=1