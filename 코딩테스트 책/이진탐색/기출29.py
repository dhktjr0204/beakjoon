import sys

n,c=map(int,sys.stdin.readline().split())
house=[int(sys.stdin.readline()) for _ in range(n)]
house.sort()
st,ed=1,house[-1]-house[0]
result=0
while st<=ed:
    mid=(st+ed)//2
    cnt=1
    current=house[0]
    for i in range(1,n):
        if house[i]>=current+mid:
            cnt+=1
            current=house[i]
    if cnt>=c:
        st=mid+1
        result=mid
    else:
        ed=mid-1     

print(result)

