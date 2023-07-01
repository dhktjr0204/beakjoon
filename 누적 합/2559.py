import sys

n,k=map(int,sys.stdin.readline().split())
num_list=list(map(int,sys.stdin.readline().split()))

sum_list=[]
sum=0
start,end=0,k-1
for i in range(start,end+1):
    sum+=num_list[i]
max=sum
while end!=n-1:
    sum-=num_list[start]
    start+=1
    end+=1
    sum+=num_list[end]
    if(max<sum):
        max=sum

print(max)
