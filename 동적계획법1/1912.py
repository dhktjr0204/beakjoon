import sys

n=int(sys.stdin.readline())
num_list=list(map(int,sys.stdin.readline().split()))

for i in range(1,n):
    num_list[i]=max(num_list[i],num_list[i]+num_list[i-1])

print(max(num_list))
