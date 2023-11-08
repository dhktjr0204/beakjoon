import sys

import sys

n=int(sys.stdin.readline())
lst=list(map(int,sys.stdin.readline().split()))
def compare(st,ed):
    if st>ed:
        return
    mid=(st+ed)//2
    if lst[mid]==mid:
        return mid
    elif lst[mid]>mid:
        return compare(st,mid-1)
    else:
        return compare(mid+1,ed)

result=compare(0,n-1)

if not result:
    print(-1)
else:
    print(result)
