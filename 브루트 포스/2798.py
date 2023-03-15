n,m=map(int, input().split())
card_list=list(map(int,input().split()))

result=0
for i in range(1,n-2):
    for j in range(i+1,n-1):
        for k in range(j+1,n):
            sum=card_list[i]+card_list[j]+card_list[k]
            if sum>m:
                continue
            else:
                result=max(result,sum)

print(result)