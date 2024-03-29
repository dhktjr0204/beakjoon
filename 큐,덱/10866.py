import sys
from collections import deque

n=int(sys.stdin.readline())
q=deque([])

for i in range(n):
    s=sys.stdin.readline().split()
    if s[0]=='push_front':
        q.appendleft(s[1])
    elif s[0]=='push_back':
        q.append(s[1])
    elif s[0]=='pop_front':
        if not q:
            print(-1)
        else:
            print(q.popleft())
    elif s[0]=='pop_back':
        if not q:
            print(-1)
        else:
            print(q.pop())
    elif s[0]=='size':
        print(len(q))
    elif s[0]=='empty':
        if not q:
            print(1)
        else:
            print(0)
    elif s[0]=='front':
        if not q:
            print(-1)
        else:
            print(q[0])
    elif s[0]=='back':
        if not q:
            print(-1)
        else:
            print(q[-1])
    