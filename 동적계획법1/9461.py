import sys

t=int(sys.stdin.readline())
dp=[0]*101
dp[1]=1
dp[2]=1
dp[3]=1

for i in range(t):
    n=int(sys.stdin.readline())
    for j in range(4,n+1):
        dp[j]=dp[j-2]+dp[j-3]
    print(dp[n])