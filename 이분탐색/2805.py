import sys

n,k=map(int,sys.stdin.readline().split())
trees=list(map(int,sys.stdin.readline().split()))

start,end=1, max(trees)
while start<=end:
    mid=(start+end)//2
    sum=0
    for i in trees:
        if i>=mid:
            sum+=i-mid
    if sum>=k:
        start=mid+1
    else:
        end=mid-1

print(end)

