import sys

n=int(sys.stdin.readline())
A=list(map(int,sys.stdin.readline().split()))
m=int(sys.stdin.readline())
X=list(map(int,sys.stdin.readline().split()))

A.sort()


for i in X:
    start,end=0,len(A)-1
    exist=False
    while start<=end:
        mid=((start+end)//2)
        if A[mid]>i:
            end=mid-1
        elif A[mid]<i:
            start=mid+1
        else:
            exist=True
            break
    print(1 if exist else 0)


