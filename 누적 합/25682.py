import sys

def minimal_board(color):
    sum_chess=[[0]*(m+1) for _ in range(n+1)]
    #체스판 칸 채우기
    for i in range(n):
        for j in range(m):
            if (i+j)%2==0:
                #0이면 첫번째 색과 같은 경우, 1이면 첫번째 색과 다른 경우이다.
                value=chess[i][j]!=color
            else:
                value=chess[i][j]==color
            sum_chess[i+1][j+1]=sum_chess[i][j+1]+sum_chess[i+1][j]-sum_chess[i][j]+value
    count=sys.maxsize
    for i in range(1,n-k+2):
        for j in range(1,m-k+2):
            count=min(count,sum_chess[i+k-1][j+k-1]-sum_chess[i+k-1][j-1]-sum_chess[i-1][j+k-1]+sum_chess[i-1][j-1])
    return count

n,m,k=map(int, sys.stdin.readline().split())
chess=[list(sys.stdin.readline()) for _ in range(n)]
print(min(minimal_board('B'), minimal_board('W')))