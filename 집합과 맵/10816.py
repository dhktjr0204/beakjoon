def binary(l,target, start, end):
    if start>end:
        return 0
    mid=(start+end)//2
    if l[mid]==target:
        return cnt.get(target)
    elif l[mid]>target:
        return binary(l,target, start, mid-1)
    else:
        return binary(l,target, mid+1, end)

n=int(input())
my_card=sorted(list(map(int,input().split())))

m=int(input())
card=list(map(int,input().split()))

cnt={}
#가지고있는 동일한 카드의 갯수
for i in my_card:
    if i in cnt:
        cnt[i]+=1
    else:
        cnt[i]=1


for i in card:
    print(binary(my_card,i,0,len(my_card)-1),end=' ')

            



