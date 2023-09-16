import sys

dy=[-1,1,-1,1,-2,2,-2,2]
dx=[-2,-2,2,2,-1,-1,1,1]

n=sys.stdin.readline().rstrip()
alpha=['a','b','c','d','e','f','g','h']
y=int(n[1])
x=alpha.index(n[0])+1

cnt=0
for i in range(8):
    ny=y+dy[i]
    nx=x+dx[i]
    if 1<=ny<8 and 1<=nx<8:
        cnt+=1
print(cnt)