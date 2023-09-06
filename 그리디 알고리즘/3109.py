import sys

r,c=map(int,sys.stdin.readline().split())
line=[list(sys.stdin.readline().rstrip()) for _ in range(r)]

visited=[[False]*c for _ in range(r)]
dx=[-1,0,1]

def dfs(x,y):
    if y==c-1:
        return True
    for i in range(3):
        nx=x+dx[i]
        ny=y+1
        if 0<=nx<r and 0<=ny<c:
            if line[nx][ny]!='x' and not visited[nx][ny]:
                visited[nx][ny]=True
                if dfs(nx,ny):
                    return True
    return False

answer=0
for i in range(r):
    if dfs(i,0):
        print(visited)
        answer+=1

print(answer)