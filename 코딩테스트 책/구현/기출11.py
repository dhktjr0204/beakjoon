import sys
from collections import deque

n=int(sys.stdin.readline())
k=int(sys.stdin.readline())

matrix=[[0]*n for _ in range(n)]
for i in range(k):
    x,y=map(int,sys.stdin.readline().split())
    matrix[x][y]=1

l=int(sys.stdin.readline())
snake_move=[]
for i in range(l):
    a,b=sys.stdin.readline().split()
    snake_move.append((int(a),b))

dy=[0,1,0,-1]
dx=[1,0,-1,0]

def turn(direction,c):
    if c=="L":
        direction=(direction-1)%4
    else:
        direction=(direction+1)%4
    return direction

def simulate():
    y,x=0,0
    matrix[y][x]=2
    direction=0
    time=0
    index=0
    q=[(y,x)]
    while True:
        ny=y+dy[direction]
        nx=x+dx[direction]
        if 0<=nx and nx<n and 0<=ny and ny<n and matrix[ny][nx]!=2:
            if matrix[ny][nx]==0:
                matrix[ny][nx]=2
                q.append((ny,nx))
                px,py=q.pop(0)
                matrix[py][px]=0
            if matrix[ny][nx]==1:
                matrix[ny][nx]=2
                q.append((ny,nx))
        else:
            time+=1
            break
        y,x=ny,nx
        time+=1
        if index<l and time==snake_move[index][0]:
            direction=turn(direction, snake_move[index][1])
            index+=1
    return time

print(simulate())
        