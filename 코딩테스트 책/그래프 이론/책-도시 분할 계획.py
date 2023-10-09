import sys

n,m=map(int,sys.stdin.readline().split())
graph=[]
parent=[0]*(n+1)

for i in range(1,n+1):
    parent[i]=i

def find_parent(parent,x):
    if parent[x]!=x:
        parent[x]=find_parent(parent,parent[x])
    return parent[x]

def union_parent(parent,a,b):
    a=find_parent(parent,a)
    b=find_parent(parent,b)
    if a<b:
        parent[b]=a
    else:
        parent[a]=b

for _ in range(m):
    a,b,c=map(int,sys.stdin.readline().split())
    graph.append((c,a,b))

graph.sort()
result=0
last=0
for i in graph:
    cost,a,b=i
    if find_parent(parent,a)!=find_parent(parent,b):
        union_parent(parent,a,b)
        result+=cost
        last=cost

print(result-last)

