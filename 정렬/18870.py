cnt=int(input())
num_list=list(map(int,input().split()))
original_list=num_list.copy()
num_list.sort()
rank=0
rank_list=dict()
for i in range(0,cnt):
    if i==0:
        rank_list[num_list[i]]=0
    elif num_list[i] in rank_list:
        rank_list[num_list[i]]=rank
    else:
        rank+=1
        rank_list[num_list[i]]=rank
for i in original_list:
    print (rank_list[i], end=' ')
