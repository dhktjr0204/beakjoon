import sys
from itertools import combinations

n,m=map(int,sys.stdin.readline().split())
matrix=[]
house=[]
chicken=[]
for row in range(n):
    lst=list(map(int,sys.stdin.readline().split()))
    for i in range(len(lst)):
        if lst[i]==1:
            house.append((row,i))
        if lst[i]==2:
            chicken.append((row,i))

candinates=list(combinations(chicken,m))

def get_sum(candinate):
    result=0
    for hx,hy in house:
        temp=1e9
        for cx,cy in candinate:
            temp=min(temp,(abs(hx-cx)+abs(hy-cy)))
        result+=temp
    return result
result=1e9
for candinate in candinates:
    result=min(result,get_sum(candinate))

print(result)

