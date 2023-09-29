import sys

n=int(sys.stdin.readline())
lst=list(map(int,sys.stdin.readline().split()))

dp=[0]*(n+1)
dp[1]=lst[0]
dp[2]=max(lst[1],lst[0])

for i in range(3,n+1):
    dp[i]=max(lst[i-1]+dp[i-2],dp[i-1])


print(dp[n])
