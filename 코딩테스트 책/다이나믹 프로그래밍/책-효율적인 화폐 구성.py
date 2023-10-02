import sys

n,m=map(int,sys.stdin.readline().split())
coin=list(int(sys.stdin.readline()) for _ in range(n))

dp=[100001]*(m+1)
dp[0]=0
for i in coin:
    for j in range(i,m+1):
        if dp[j-i]!=10001:
            dp[j]=min(dp[j],dp[j-i]+1)

if dp[m]==100001:
    print(-1)
else:
    print(dp[m])
    

