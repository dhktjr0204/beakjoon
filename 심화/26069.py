n=int(input())

member={}

for i in range(n):
    memA,memB=map(str,input().split())
    if memA not in member:
        member[memA]=0
    if memB not in member:
        member[memB]=0
    if memA=="ChongChong" or memB=="ChongChong":
        member[memA]=1
        member[memB]=1
    if member[memA]==1 or member[memB]==1:
        member[memA]=1
        member[memB]=1
cnt=0
for key,value in member.items():
    if value==1:
        cnt+=1
print(cnt)
    