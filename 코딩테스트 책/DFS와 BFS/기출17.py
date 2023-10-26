import sys
from collections import deque

n,k=map(int,sys.stdin.readline().split())
matrix=[]
data=[]

dx=[-1,0,1,0]
dy=[0,-1,0,1]

for i in range(n):
    matrix.append(list(map(int,sys.stdin.readline().split()))) 
    for j in range(n):
        if matrix[i][j]!=0:
            data.append((matrix[i][j],0,i,j))
s,x,y=map(int,sys.stdin.readline().split())

data.sort()

q=deque(data)
while q:
    virus,cnt,v_x,v_y=q.popleft()
    if cnt==s:
        break
    for i in range(4):
        nx=v_x+dx[i]
        ny=v_y+dy[i]
        if nx>=0 and nx<n and ny>=0 and ny<n:
            if matrix[nx][ny]==0:
                matrix[nx][ny]=virus
                q.append((virus,cnt+1,nx,ny))

print(matrix[x-1][y-1])