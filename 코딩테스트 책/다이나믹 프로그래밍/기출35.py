import sys

n=int(sys.stdin.readline())

two,three,five=2,3,5
cnt2,cnt3,cnt5=0,0,0

dp=[0]*n
dp[0]=1
for i in range(1,n):
    dp[i]=min(two,three,five)

    if dp[i]==two:
        cnt2+=1
        two=dp[cnt2]*2
    if dp[i]==three:
        cnt3+=1
        three=dp[cnt3]*3
    if dp[i]==five:
        cnt5+=1
        five=dp[cnt5]*5

print(dp[n-1])