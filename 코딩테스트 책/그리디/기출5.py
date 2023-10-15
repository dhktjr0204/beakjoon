import sys
from collections import Counter

n,m=map(int,sys.stdin.readline().split())
bowling=list(map(int,sys.stdin.readline().split()))
"""cnt=[]
for i in range(1,m+1):
    if bowling.count(i)>1:
        cnt.append(bowling.count(i))

result=n*(n-1)//2
for i in cnt:
    result-=i*(i-1)//2

print(result)"""
array=[0]*11
for x in bowling:
    array[x]+=1

result=0
for i in range(1,m+1):
    n-=array[i]
    result+=array[i]*n
print(result)