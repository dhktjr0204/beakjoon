import sys

n,k=map(int,sys.stdin.readline().split())
stuff=[[0,0]]
bag=[[0]*(k+1) for _ in range(n+1)]
for i in range(n):
    w,v=map(int,sys.stdin.readline().split())
    stuff.append([w,v])

for i in range(1, n+1):
    for j in range(1, k+1):
        weight=stuff[i][0]
        value=stuff[i][1]

        if j<weight:
            bag[i][j]=bag[i-1][j]
        else:
            bag[i][j]=max(value+bag[i-1][j-weight], bag[i-1][j])

print(bag[n][k])