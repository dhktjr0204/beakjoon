import sys

n,c=map(int, sys.stdin.readline().split())
wifi=[int(sys.stdin.readline()) for _ in range(n)]

wifi.sort()

start,end=1,wifi[-1]-wifi[0]
answer=0
while start<=end:
    mid=(start+end)//2
    cnt=1
    current=wifi[0]

    for i in range(1,len(wifi)):
        if wifi[i]>=current+mid:
            cnt+=1
            current=wifi[i]

    if cnt>=c:
        start=mid+1
        answer=mid
    else:
        end=mid-1
print(answer)