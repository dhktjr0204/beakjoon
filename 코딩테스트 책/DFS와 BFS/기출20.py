import sys
from itertools import combinations

n=int(sys.stdin.readline())
matrix=[list(sys.stdin.readline().split()) for _ in range(n)]
teacher=[]
space=[]

for i in range(n):
    for j in range(n):
        if matrix[i][j]=='T':
            teacher.append((i,j))
        if matrix[i][j]=='X':
            space.append((i,j))
def watch(x,y,direction):
    #왼쪽방향
    if direction==0:
        while y>=0:
            if matrix[x][y]=='S':
                return True
            if matrix[x][y]=='O':
                return False
            y-=1
    if direction==1:
        while y<n:
            if matrix[x][y]=='S':
                return True
            if matrix[x][y]=='O':
                return False
            y+=1
    #위쪽
    if direction==2:
        while x>=0:
            if matrix[x][y]=='S':
                return True
            if matrix[x][y]=='O':
                return False
            x-=1
    if direction==3:
        while x<n:
            if matrix[x][y]=='S':
                return True
            if matrix[x][y]=='O':
                return False
            x+=1
    return False

def process():
    for x,y in teacher:
        for i in range(4):
            if watch(x,y,i):
                return True
    return False
    
find=False

for data in combinations(space,3):
    for x,y in data:
        matrix[x][y]='O'
    
    if not process():
        find=True
        break
    for x,y in data:
        matrix[x][y]='X'

if find:
    print('YES')
else:
    print('NO')
    

    

                

