import sys

n=int(sys.stdin.readline())

video=[list(map(int,sys.stdin.readline().strip())) for _ in range(n)]
result=[]
def scanVideo(x,y,n):
    color=video[x][y]
    for i in range(x,x+n):
        for j in range(y,y+n):
            if color!=video[i][j]:
                color=-1
                break
    if color==-1:
        print("(",end='')
        n=n//2
        scanVideo(x,y,n)
        scanVideo(x,y+n,n)
        scanVideo(x+n,y,n)
        scanVideo(x+n,y+n,n)
        print(")", end='')
    elif color==1:
        print(1,end='')
    else:
        print(0,end='')

scanVideo(0,0,n)
