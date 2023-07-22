import sys

n,m=map(int,sys.stdin.readline().split())
A=[]
B=[]
for i in range(n):
    A.append(list(map(int,sys.stdin.readline().split())))

m,k=map(int,sys.stdin.readline().split())
for i in range(m):
    B.append(list(map(int,sys.stdin.readline().split())))

C=[[0 for _ in range(k)] for _ in range(n)]

for N in range(n):
    for K in range(k):
        for M in range(m):
            C[N][K]+=A[N][M]*B[M][K]

for i in C:
    for j in i:
        print(j, end=' ')
    print()
