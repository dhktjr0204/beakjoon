import sys

t=int(sys.stdin.readline())
for _ in range(t):
    n,m=map(int,sys.stdin.readline().split())
    lst=list(map(int,sys.stdin.readline().split()))
    matrix=[[] for _ in range(n)]
    cnt=0
    for i in range(0,len(lst)):
        if cnt==3:
            cnt=0
        matrix[i//4].append(lst[i])
        cnt+=1
    dp=[[0]*m for _ in range(n)]

    for i in range(n):
        dp[i][0]=matrix[i][0]
    for i in range(1,m):
        for row in range(0,n):
            if row==0:
                dp[row][i]=max(dp[row][i-1],dp[row+1][i-1])+matrix[row][i]
            elif row==n-1:
                dp[row][i]=max(dp[row-1][i-1],dp[row][i-1])+matrix[row][i]
            else:
                dp[row][i]=max(dp[row-1][i-1],dp[row][i-1],dp[row+1][i-1])+matrix[row][i]
    result=0
    for i in range(n):
        result=max(result,dp[i][m-1])
    print(result)
