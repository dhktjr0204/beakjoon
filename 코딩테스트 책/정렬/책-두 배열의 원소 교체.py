import sys

a,b=map(int,sys.stdin.readline().split())
n=list(map(int,sys.stdin.readline().split()))
m=list(map(int,sys.stdin.readline().split()))
m=sorted(m,reverse=True)
n.sort()

for i in range(b):
    if n[i]<m[i]:
        n[i],m[i]=m[i],n[i]

print(sum(n))