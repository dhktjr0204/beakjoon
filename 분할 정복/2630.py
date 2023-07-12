import sys

n=int(sys.stdin.readline())

paper=[]

for i in range(n):
    paper.append(list(map(int,sys.stdin.readline().split())))

count=[]
def scanPaper(a,b,n):
    color=paper[a][b]
    for i in range(a,a+n):
        for j in range(b,b+n):
            if color!=paper[i][j]:
                scanPaper(a,b,n//2)
                scanPaper(a,b+n//2,n//2)
                scanPaper(a+n//2,b,n//2)
                scanPaper(a+n//2,b+n//2,n//2)
                return
    if color==0:
        count.append(0)
    else:
        count.append(1)

scanPaper(0,0,n)

print(count.count(0))
print(count.count(1))
