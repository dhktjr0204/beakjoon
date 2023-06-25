import sys

n=int(sys.stdin.readline())
list=[]
dp=[1]*n

for i in range(n):
    a,b=map(int, sys.stdin.readline().split())
    list.append([a,b])
list.sort()

for i in range(1,n):
    for j in range(0,i):
        if list[j][1]<list[i][1]:
            dp[i]=max(dp[j]+1,dp[i])
print(n-max(dp))