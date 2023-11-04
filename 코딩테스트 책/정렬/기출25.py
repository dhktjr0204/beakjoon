import sys

n=int(sys.stdin.readline())
lan=list(map(int,sys.stdin.readline().split()))
lan.sort()
print(lan[(n-1)//2])