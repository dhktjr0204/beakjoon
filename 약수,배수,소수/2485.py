import math

n=int(input())
m=list(int(input()) for _ in range(n))

s=[]
for i in range(len(m)-1):
    s.append(m[i+1]-m[i])

g=s[0]
for i in range(1,len(s)):
    g=math.gcd(g,s[i])

cnt=0
for i in s:
    cnt+=i//g-1
print(cnt)