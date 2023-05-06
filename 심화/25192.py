n=int(input())

member={}
cnt=0
for i in range(n):
    str=input()
    if str=='ENTER':
        for key,value in member.items():
            if value==1:
                cnt+=1
        member={}
    else:
        if str not in member:
            member[str]=1
for key,value in member.items():
    if value==1:
        cnt+=1

print(cnt)