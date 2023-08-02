import sys

k,n=map(int, sys.stdin.readline().split())

lan=[]

for i in range(k):
    lan.append(int(sys.stdin.readline()))

start,end=1,max(lan)
while start<=end:
    sum=0
    mid=(start+end)//2
    for i in lan:
        sum+=i//mid
    if sum>=n:
        start=mid+1
    else:
        end=mid-1

print(end)

