import math

n=int(input())
res=[]
for i in range(n):
    a,b=map(int,input().split())
    gcd=math.gcd(a,b)
    res.append(a*b//gcd)

for i in res:
    print(i)
