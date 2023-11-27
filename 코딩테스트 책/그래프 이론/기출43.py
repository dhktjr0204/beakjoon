import sys


def find_parent(parent, x):
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
edges=[]
parent=[0]*n

for i in range(1,n):
    parent[i]=i
for _ in range(m):
    a,b,cost=map(int,sys.stdin.readline().split())

    edges.append((cost,a,b))

edges.sort()
result=0
total=0
for edge in edges:
    cost,a,b=edge
    total+=cost
    if find_parent(parent,a)!=find_parent(parent,b):
        union_parent(parent,a,b)
        result+=cost
print(total- result)
    