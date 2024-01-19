def solution(elements):
    dp=[[0]*(len(elements)) for _ in range(len(elements))]
    for i in range(0,len(elements)):
        for j in range(i,len(elements)+i):
            dp[i][j%len(elements)]=dp[i-1][j%len(elements)]+elements[(j+i)%len(elements)]
    total=[]
    for i in dp:
        total+=set(i)
    answer=len(set(total))
    return answer

print(solution([7,9,1,1,4]))