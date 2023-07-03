import sys

n,m=map(int, sys.stdin.readline().split())
num=list(map(int, sys.stdin.readline().split()))

sum=0
numRemainder=[0]*m

for i in range(n):
    sum+=num[i]
    numRemainder[sum%m]+=1

result=numRemainder[0]

for i in numRemainder:
    result+=i*(i-1)//2

print(result)