n=int(input())
my_card_list=sorted(list(map(int,input().split())))

m=int(input())
card_list=list(map(int,input().split()))

for i in card_list:
    low, high=0, n-1
    exist=False
    while low<=high:
        mid=(low+high)//2
        if my_card_list[mid]>i:
            high=mid-1
        elif my_card_list[mid]<i:
            low=mid+1
        else:
            exist=True
            break
    print(1 if exist else 0, end=' ')
