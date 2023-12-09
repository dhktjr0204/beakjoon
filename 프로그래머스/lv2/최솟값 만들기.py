def solution(A,B):
    A.sort(reverse=True)
    B.sort()
    answer=0
    for i in range(len(A)):
        answer+=(A[i]*B[i])
    return answer

print(solution([1, 4, 2],[5, 4, 4]))