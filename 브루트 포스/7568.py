human=[list(map(int,input().split())) for _ in range(int(input()))]

for i in human:
    rank=1
    for j in human:
        #자신보다 무겁고 큰 사람이 몇명인지
        if i[0]<j[0] and i[1]<j[1]:
            rank+=1

    print(rank, end=" ")

