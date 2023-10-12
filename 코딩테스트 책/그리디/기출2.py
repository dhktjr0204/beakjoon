import sys

n=sys.stdin.readline().rstrip()

"""result=[]
def cal(total,i):
    if i==len(n):
        result.append(total)
        return

    cal(total+int(n[i]),i+1)
    cal(total*int(n[i]),i+1)

cal(int(n[0]),1)
print(max(result))"""

result=int(n[0])
for i in range(1,len(n)):
    num=int(n[i])
    if num<=1 or result<=1:
        result+=num
    else:
        result*=num
print(result)
