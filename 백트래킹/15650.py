n,m=map(int,input().split())

S=[]
def dfs(i):
    if len(S)==m:
        print(' '.join(map(str,S)))
        return

    for i in range(i,n+1):
        if i not in S:
            S.append(i)
            dfs(i+1)
            S.pop()
    
dfs(1)
