n=int(input()) #연산할 숫자의 개수
num=list(map(int, input().split()))
op=list(map(int,input().split()))

maximum,minimum=-99999999, 99999999

def dfs(depth, total, plus, minus, mult, div):
    global maximum,minimum
    if depth==n:
        maximum=max(total, maximum)
        minimum=min(total, minimum)
        return
    if plus:
        dfs(depth+1,total+num[depth],plus-1,minus,mult,div)
    if minus:
        dfs(depth+1,total-num[depth],plus,minus-1,mult,div)
    if mult:
        dfs(depth+1,total*num[depth],plus,minus,mult-1,div)
    if div:
        dfs(depth+1,int(total/num[depth]),plus,minus,mult,div-1)


dfs(1, num[0], op[0], op[1], op[2], op[3])
print(maximum)
print(minimum)