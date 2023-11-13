import sys

n=int(sys.stdin.readline())
triangle=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]

for i in range(1,n):
    for j in range(0,i+1):
        if j==0:
            triangle[i][j]+=triangle[i-1][j]
        elif j==len(triangle[i])-1:
            triangle[i][j]+=triangle[i-1][j-1]
        else:
            triangle[i][j]+=max(triangle[i-1][j],triangle[i-1][j-1])

print(max(triangle[n-1]))