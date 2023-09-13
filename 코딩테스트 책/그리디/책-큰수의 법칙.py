import sys

n,m,k=map(int,sys.stdin.readline().split())
lst=list(map(int,sys.stdin.readline().split()))
lst.sort()
first=lst[n-1]
second=lst[n-2]
result=0
count=m//(k+1)*k+m%(k+1)
result+=count*first+(m-count)*second
print(result)