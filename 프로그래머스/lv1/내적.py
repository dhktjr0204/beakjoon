def solution(a, b):
    answer = sum(a[i]*b[i] for i in range(len(a)))
    return answer

print(solution([1,2,3,4],[-3,-1,0,2]))