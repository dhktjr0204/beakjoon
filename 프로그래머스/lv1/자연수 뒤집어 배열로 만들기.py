def solution(n):
    answer = list(map(int,str(n).strip()))
    answer.reverse()
    return answer

print(solution(12345))