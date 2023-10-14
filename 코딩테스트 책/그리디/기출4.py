import sys

n=int(sys.stdin.readline())
coin=list(map(int,sys.stdin.readline().split()))

"""result=[False]*(1000000)
for i in range(0,n):
    for j in range(i,n):
        result[sum(coin[i:j+1])]=True

for i in range(1,max(coin)+1):
    if not result[i]:
        print(i)
        break"""
coin.sort()
target=1
for x in coin:
    if target<x:
        break
    target+=x

print(target)
