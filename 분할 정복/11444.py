import sys

n=int(sys.stdin.readline())
p=1000000007


def mul(A,B):
    n=len(A)   
    Z=[[0]*n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            sum=0
            for k in range(n):
                sum+=A[i][k]*B[k][j]
            Z[i][j]=sum%p
    
    return Z

def square(A,k):
    if k==1:
        for i in range(len(A)):
            for j in range(len(A)):
                A[i][j]%=p
        return A
    else:
        tmp=square(A,k//2)
        if k%2:
            return mul(mul(tmp,tmp),A)
        else:
            return mul(tmp,tmp)
        
matrix=[[1,1],[1,0]]

print(square(matrix,n)[0][1])