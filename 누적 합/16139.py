import sys
import string

s=sys.stdin.readline().strip()
q=int(sys.stdin.readline())

alphabet_list={}
for i in string.ascii_lowercase:
    alphabet_list[i]=[0]
    count=0
    for j in range(len(s)):
        if s[j]==i:
            count+=1
        alphabet_list[i].append(count)

for i in range(q):
    a,l,r=sys.stdin.readline().rstrip().split()
    l,r=int(l),int(r)
    print(alphabet_list[a][r+1]-alphabet_list[a][l])
