import sys

n=sys.stdin.readline().rstrip()

result=[0]*2
result[0]=1
flag=0
for i in n:   
    if i=='0':
        if flag==1:
            flag=0
            result[0]+=1
    else:
        if flag==0:
            flag=1
            result[1]+=1

print(min(result))
"""
count0=0
count1=0
if n[0]=='1':
    count0+=1
else:
    count1+=1

for i in range(len(n)-1):
    if n[i]!=n[i+1]:
        if n[i+1]=='1':
            count0+=1
        else:
            count1+=1
print(min(count0,count1))"""