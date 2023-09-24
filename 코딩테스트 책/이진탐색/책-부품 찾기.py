import sys
n=int(sys.stdin.readline())
A=list(map(int,sys.stdin.readline().split()))
m=int(sys.stdin.readline())
B=list(map(int,sys.stdin.readline().split()))

A.sort()
for i in B:
    st,ed=0,len(A)
    flag=0
    while st<=ed:
        mid=(st+ed)//2
        if i<A[mid]:
            ed=mid-1
        elif i>A[mid]:
            st=mid+1
        else:
            flag=1
            print("yes", end=' ')
            break
    if flag==0:
        print("no",end=' ')