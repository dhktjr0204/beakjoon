import sys
from collections import deque

n=int(sys.stdin.readline())
matrix=[list(map(int, input().split())) for _ in range(n)]
baby_shark=[]
for i in range(n):
    for j in range(n):
        if matrix[i][j]==9:
            baby_shark.append(i)
            baby_shark.append(j)

dx=[-1,0,1,0]
dy=[0,-1,0,1]

def bfs(a,b):
    visited=[[0]*n for _ in range(n)]
    q=deque()
    q.append((a,b))
    visited[a][b]=1
    cand=[]
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<n and 0<=ny<n and visited[nx][ny]==0:
                #조건에 따라 움직이기 때문에 후보에 등록해야함(아기상어보다 크기가 작은 물고기)
                if matrix[a][b]>matrix[nx][ny] and matrix[nx][ny]!=0:
                    visited[nx][ny]=visited[x][y]+1
                    cand.append((visited[nx][ny]-1, nx,ny))
                elif matrix[a][b]==matrix[nx][ny]:
                    visited[nx][ny]=visited[x][y]+1
                    q.append((nx,ny))
                elif matrix[nx][ny]==0:
                    visited[nx][ny]=visited[x][y]+1
                    q.append((nx,ny))
    #가까운 순, 가장 위에 있는 순, 가장 왼쪽에 있는 순으로 정렬
    return sorted(cand, key=lambda x: (x[0],x[1],x[2]))

i,j=baby_shark
size=[2,0]
cnt=0
while True:
    matrix[i][j]=size[0]
    cand=deque(bfs(i,j))
    if not cand:
        break
    step, xx, yy= cand.popleft()
    cnt+=step
    size[1]+=1
    
    #자신의 크기와 같은 수의 물고기를 먹을 때마가 크기가 1 증가
    if size[0]==size[1]:
        size[0]+=1
        size[1]=0

    matrix[i][j]=0
    i,j=xx, yy

print(cnt)
