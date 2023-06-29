import sys

n,m=map(int, sys.stdin.readline().split())
num=list(map(int, sys.stdin.readline().split()))
sum=[0]
temp=0
for i in num:
    temp+=i
    sum.append(temp)

for i in range(m):
    a,b=map(int,sys.stdin.readline().split())
    print(sum[b]-sum[a-1])