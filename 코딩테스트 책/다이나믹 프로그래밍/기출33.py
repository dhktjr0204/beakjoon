import sys

n=int(sys.stdin.readline())
counsel=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]
dp=[0 for _ in range(n+1)]

for i in range(n):
    for j in range(i+counsel[i][0],n+1):
        if dp[j]<dp[i]+counsel[i][1]:
            dp[j]=dp[i]+counsel[i][1]
        
print(dp[-1])