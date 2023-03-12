coordi=[list(map(int,input().split())) for _ in range(int(input()))]
rev_coordi=[]
for i in coordi:
    rev=[i[1],i[0]]
    rev_coordi.append(rev)
rev_coordi.sort()

for i in rev_coordi:
    print(i[1], i[0])