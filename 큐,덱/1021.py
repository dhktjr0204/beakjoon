import sys
from collections import deque

n,m=map(int,sys.stdin.readline().split())
c=list(map(int,sys.stdin.readline().split()))

q=deque(i+1 for i in range(n))

count=0
for i in c:
    while True:
        if q[0]==i:
            q.popleft()
            break
        else:
            if q.index(i)<len(q)/2:
                while q[0]!=i:
                    q.append(q.popleft())
                    count+=1
            else:
                while q[0]!=i:
                    q.insert(0,q.pop())
                    count+=1

print(count)
