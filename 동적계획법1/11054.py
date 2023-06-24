import sys

n=int(sys.stdin.readline())
s=list(map(int,sys.stdin.readline().split()))
dp=[0 for _ in range(n)]
dp2=[0 for _ in range(n)]
result=[0 for _ in range(n)]

for i in range(0,n):
    for j in range(0,i):
        if s[i]>s[j] and dp[i]<dp[j]:
            dp[i]=dp[j]
    dp[i]+=1

for i in range(n-1,-1,-1):
    for j in range(i+1,n): 
        if s[i]>s[j] and dp2[i]<dp2[j]:
            dp2[i]=dp2[j]
    dp2[i]+=1
    result[i]=dp[i]+dp2[i]
print(max(result)-1)
