import sys

n=int(sys.stdin.readline())

num=list(map(int,sys.stdin.readline().split()))

dp=[0]

for i in num:
    #마지막으로 들어간 num보다 크다면 리스트에 들어감
    if dp[-1]<i:
        dp.append(i)
    else:
        left=0
        right=len(dp)

        #i수 이상의 수를 i로 대체
        while left<right:
            mid=(left+right)//2
            if dp[mid]<i:
                left=mid+1
            else:
                right=mid
        dp[right]=i
    
print(len(dp)-1)