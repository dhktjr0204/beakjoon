def solution(n):
    answer = list(str(n).strip())
    answer.sort(reverse=True)
    answer=int(''.join(answer))
    return answer

print(solution(118372))