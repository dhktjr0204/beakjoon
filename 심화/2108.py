from collections import Counter
import sys
n=int(sys.stdin.readline())

num=[]
for i in range(n):
    num.append(int(sys.stdin.readline()))

num.sort()
print(round(sum(num)/len(num)))
print(num[len(num)//2])

cnt=Counter(num).most_common(2)
if len(cnt)>1 and cnt[0][1]==cnt[1][1]:
    print(cnt[1][0])
else:
    print(cnt[0][0])

print(max(num)-min(num))
