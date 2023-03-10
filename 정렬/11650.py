coordi=[list(map(int,input().split())) for _ in range(int(input()))]

coordi.sort()

for i in coordi:
    print(i[0], i[1])