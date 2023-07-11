import sys

n=int(sys.stdin.readline())
road=list(map(int, sys.stdin.readline().split()))
money=list(map(int, sys.stdin.readline().split()))

m=money[0]
total=money[0]*road[0]
dist=0
for i in range(1,n-1):
    if money[i]<m:
        total+=dist*m
        dist=road[i]
        m=money[i]
    else:
        dist+=road[i]
    if i == n-2:
        total+=dist*m

print(total)