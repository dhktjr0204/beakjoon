import sys

n,m=map(int,sys.stdin.readline().split())
rice=list(map(int,sys.stdin.readline().split()))

st,ed=0,max(rice)
result=0
while st<=ed:
    mid=(st+ed)//2
    sum=0
    for i in rice:
        if i>mid:
            sum+=i-mid
    if sum<m:
        ed=mid-1
    else:
        result=mid
        st=mid+1

print(result)