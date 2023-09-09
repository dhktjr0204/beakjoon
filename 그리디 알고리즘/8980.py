import sys

n,c=map(int,sys.stdin.readline().split())
m=int(sys.stdin.readline())
boxs=[list(map(int,sys.stdin.readline().split())) for _ in range(m)]
boxs.sort(key=lambda x: x[1])

print(boxs)

capacity=[c]*n
total=0

for s,r,box in boxs:
    _min=c
    for i in range(s,r):
        if _min>min(capacity[i], box):
            _min=min(capacity[i],box)
    for i in range(s,r):
        capacity[i]-=_min
    total+=_min

print(total)
