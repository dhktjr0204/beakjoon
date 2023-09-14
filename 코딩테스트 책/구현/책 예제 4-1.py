import sys

n=int(sys.stdin.readline())
lst=list(sys.stdin.readline().split())
dy=[0,0,-1,1]
dx=[-1,1,0,0]
_type=['L','R','U','D']
y,x=1,1
for i in lst:
    for j in range(4):
        if i==_type[j]:
            ny=y+dy[j]
            nx=x+dx[j]
    
    if 1<=ny<n and 1<=nx<n:
        y,x=ny,nx
    
print(y,x)



