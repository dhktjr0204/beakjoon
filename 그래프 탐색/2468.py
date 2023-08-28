import sys
sys.setrecursionlimit(100000)


n=int(sys.stdin.readline())
MAX=0
location=[]
for i in range(n):
    location.append(list(map(int, sys.stdin.readline().split())))
    MAX=max(MAX,max(location[-1]))

dy=[-1,0,1,0]
dx=[0,-1,0,1]

def dfs(x,y,h):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < n and not rainy[nx][ny] and location[nx][ny] > h:
            rainy[nx][ny] = True
            dfs(nx, ny, h)

result=0
for i in range(MAX):
    rainy=[[False]*n for _ in range(n)]
    cnt=0

    for j in range(n):
        for k in range(n):
            if location[j][k]>i and not rainy[j][k]:
                rainy[j][k]=True
                cnt+=1
                dfs(j,k,i)
    result=max(result,cnt)

print(result)
