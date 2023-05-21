import sys
from collections import deque

n,k=map(int,sys.stdin.readline().split())
q=deque([i for i in range(1,n+1)])

print('<',end="")
while q:
    for i in range(k-1):
        q.append(q.popleft())
    print(q.popleft(),end="")
    if q:
        print(', ',end="")

print(">")
