import sys
from collections import deque

n=int(sys.stdin.readline())
house=[list(map(int,sys.stdin.readline().strip())) for _ in range(n)]
visited=[[False]*(n) for _ in range(n)]

dy=[-1,0,1,0]
dx=[0,-1,0,1]

village=[]
def find_village(y,x):
    q=deque([(y,x)])
    visited[y][x]=True
    count=1
    while q:
        y,x=q.popleft()
        for i in range(4):
            ny=y+dy[i]
            nx=x+dx[i]
            if not 0<=ny<n or not 0<=nx<n:
                continue
            if not visited[ny][nx] and house[ny][nx]==1:
                visited[ny][nx]=True
                q.append((ny,nx))
                count+=1
    return count

cnt=[]
for i in range(n):
    for j in range(n):
        if not visited[i][j] and house[i][j]==1:
            cnt.append(find_village(i,j))

cnt.sort()
print(len(cnt))
for i in cnt:
    print(i)