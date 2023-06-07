n=int(input())
visited=[False for _ in range(n)]
team=[]
for i in range(n):
    m=list(map(int,input().split()))
    team.append(m)
result=2147000000

def dfs(L,idx):
    global result
    if L==n//2:
        A=0
        B=0
        for i in range(n):
            for j in range(n):
                if visited[i] and visited[j]:
                    A+=team[i][j]
                elif not visited[i] and not visited[j]:
                    B+=team[i][j]
        result=min(result,abs(A-B))
        return
    for i in range(idx,n):
        if not visited[i]:
            visited[i]=True
            dfs(L+1,i+1)
            visited[i]=False


dfs(0,0)
print(result)