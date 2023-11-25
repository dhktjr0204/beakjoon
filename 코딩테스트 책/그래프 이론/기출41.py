import sys

def find_parent(parent,x):
    if x!=parent[x]:
        parent[x]=find_parent(parent,parent[x])

    return parent[x]

def union_parent(parent,a,b):
    a=find_parent(parent,a)
    b=find_parent(parent,b)
    if a<b:
        parent[b]=a
    else:
        parent[a]=b

n,m=map(int,sys.stdin.readline().split())
parent=[0]*(n+1)

for i in range(1,n+1):
    parent[i]=i
    
for i in range(n):
    lst=list(map(int,sys.stdin.readline().split()))
    for j in range(n):
        if lst[j]==1:
            union_parent(parent,i+1,j+1)

travel=list(map(int,sys.stdin.readline().split()))
result=True

for i in range(m-1):
    if find_parent(parent,travel[i])!=find_parent(parent,travel[i+1]):
        result=False
print(parent)
if result:
    print("YES")
else:
    print("NO")

