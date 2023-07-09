import sys

s=sys.stdin.readline().split('-')
num=[]
for i in s:
    sum=0
    n=i.split('+')
    for j in n:
        sum+=int(j)
    num.append(sum)
n=num[0]
for i in range(1,len(num)):
    n-=num[i]
print(n)