import sys

n=int(sys.stdin.readline())

paper=[list(map(int, sys.stdin.readline().split())) for _ in range(n)]


result_minus=0
result_zero=0
result_plus=0

def scanPaper(x,y,n):
    global result_plus, result_zero, result_minus
    color=paper[x][y]

    for i in range(x,x+n):
        for j in range(y,y+n):
            if color!=paper[i][j]:
                for k in range(3):
                    for l in range(3):
                        scanPaper(x+k*n//3,y+l*n//3,n//3)
                return
    if color==-1:
        result_minus+=1
    elif color==0:
        result_zero+=1
    else:
        result_plus+=1

scanPaper(0,0,n)

print(result_minus)
print(result_zero)
print(result_plus)
