import sys
from collections import deque

t=int(sys.stdin.readline())

for i in range(t):
    s=sys.stdin.readline()
    n=int(sys.stdin.readline())
    q=deque(sys.stdin.readline().rstrip()[1:-1].split(","))

    if n==0:
        q=deque()
    rev=0
    flag=0
    for j in s:
        if j=='R':
            rev+=1
        elif j=='D':
            if len(q)>0:
                if rev%2==0:
                    q.popleft()
                else:
                    q.pop()
            else:
                print("error")
                flag=1
                break
    
    if flag==0:
        if rev%2==0:
            print("["+",".join(q)+"]")
        else:
            q.reverse()
            print("["+",".join(q)+"]")