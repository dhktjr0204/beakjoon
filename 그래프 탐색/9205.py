import sys
from collections import deque

t=int(sys.stdin.readline())

def bfs():
    q=deque()
    q.append([home[0],home[1]])
    while q:
        x,y=q.popleft()
        if abs(x-fest[0])+abs(y-fest[1])<=1000:
            print("happy")
            return
        for i in range(n):
            if not visited[i]:
                new_x, new_y=store[i]
                if abs(x-new_x)+abs(y-new_y)<=1000:
                    q.append((new_x,new_y))
                    visited[i]=1
    print("sad")
    return

                
for i in range(t):
    #편의점 갯수
    n=int(sys.stdin.readline())
    home=list(map(int,sys.stdin.readline().split()))
    store=[]
    for j in range(n):
        y,x=map(int,sys.stdin.readline().split())
        store.append((y,x))
    fest=list(map(int,sys.stdin.readline().split()))
    visited=[0 for _ in range(n)]
    bfs()





