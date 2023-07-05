import sys

n,k=map(int,sys.stdin.readline().split())

coin=[]
for i in range(n):
    coin.append(int(sys.stdin.readline()))
count=0
for i in range(n-1,-1,-1):
    while True:
        if k>=coin[i]:
            count+=k//coin[i]
            k%=coin[i]
        else:
            break
print(count)

