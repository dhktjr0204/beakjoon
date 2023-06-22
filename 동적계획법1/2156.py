import sys

n=int(sys.stdin.readline())

wine=[0]
for i in range(n):
    wine.append(int(sys.stdin.readline()))

dp=[0]
dp.append(wine[1])
dp.append(wine[1]+wine[2])

for i in range(3,n+1):
    dp.append(max(dp[i-1], wine[i]+wine[i-1]+dp[i-3], wine[i]+dp[i-2]))

print(dp[n])