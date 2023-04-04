a,b=map(int, input().split())
A_list=list(map(int,input().split()))
B_list=list(map(int,input().split()))

print(a+b-len(set(A_list)&set(B_list))*2)