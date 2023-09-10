import sys

n,l=map(int,sys.stdin.readline().split())
water=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]
water.sort()
cnt=0

for pool in range(len(water)):
    length=water[pool][1]-water[pool][0]
    if pool==len(water)-1:
        cnt+=(length-1)//l+1
        break
    if length%l:
        tmp=l-(length%l)
        now_cover=water[pool][1]+tmp
        if water[pool+1][0]<=now_cover:
            water[pool+1][0]=now_cover
        cnt+=length//l+1
    else:
        cnt+=length//l

print(cnt)
