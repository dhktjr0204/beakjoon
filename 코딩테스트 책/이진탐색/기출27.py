import sys

n,x=map(int,sys.stdin.readline().split())
lst=list(map(int,sys.stdin.readline().split()))
st,ed=0,len(lst)-1
total=0
while st<ed:
    mid=(st+ed)//2
    if x==lst[mid]:
        for i in range(mid,-1,-1):
            if lst[i]==x:
                total+=1
            else:
                break
        for j in range(mid+1,len(lst)):
            if lst[j]==x:
                total+=1
            else:
                break
        break
    elif x>lst[mid]:
        st=mid+1
    else:
        ed=mid-1
if total==0:
    print(-1)
else:
    print(total)