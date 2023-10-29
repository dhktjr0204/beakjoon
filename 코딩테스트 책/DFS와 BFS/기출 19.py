import sys

n=int(sys.stdin.readline())
A=list(map(int,sys.stdin.readline().split()))
operate=list(map(int,sys.stdin.readline().split()))
result=[]
maximum,minimum=-1e9,1e9
def cal(total,idx,plus,minus,mul,div):
    global maximum,minimum
    if n==idx:
        maximum=max(total, maximum)
        minimum=min(total, minimum)
        return
    if plus>0:
        cal(total+A[idx],idx+1,plus-1,minus,mul,div)
    if minus>0:
        cal(total-A[idx],idx+1,plus,minus-1,mul,div)
    if mul>0:
        cal(total*A[idx],idx+1,plus,minus,mul-1,div)
    if div>0:
        cal(total//A[idx],idx+1,plus,minus,mul,div-1)

cal(A[0],1,operate[0],operate[1],operate[2],operate[3])
print(maximum)
print(minimum)