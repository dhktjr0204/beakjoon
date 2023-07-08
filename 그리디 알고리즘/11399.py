import sys

n=int(sys.stdin.readline())
atm=list(map(int,sys.stdin.readline().split()))

atm.sort()

sum=0
for i in range(n):
    sum+=atm[i]*(n-i)

print(sum)