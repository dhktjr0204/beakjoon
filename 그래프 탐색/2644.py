import sys

n=int(sys.stdin.readline())
a,b=map(int,sys.stdin.readline().split())
m=int(sys.stdin.readline())


family=[[False]*(n+1) for _ in range(n+1)]
visited=[False]*(n+1)

for i in range(m):
    x,y=map(int,sys.stdin.readline().split())
    family[x][y]=True
    family[y][x]=True

result=[]

def dfs(v,cnt):
    cnt+=1
    visited[v]=True
    if v==b:
        result.append(cnt)
    for i in range(1,n+1):
        if not visited[i] and family[v][i]:
            dfs(i,cnt)

dfs(a,0)
if len(result)==0:
    print(-1)
else:
    print(result[0]-1)

