import sys
from collections import deque

f,s,g,u,d=map(int, sys.stdin.readline().split())
building=[0]*(f+1)


def bfs():
    q=deque()
    q.append(s)
    building[s]=1
    while q:
        x=q.popleft()
        if x==g:
            return building[x]-1
        
        for i in (x+u, x-d):
            if 0<i<=f and not building[i]:
                building[i]=building[x]+1
                q.append(i)
    return "use the stairs"

print(bfs())