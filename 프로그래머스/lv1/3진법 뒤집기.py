def solution(n):
    answer=''
    while n>0:
        n,remain=divmod(n,3)
        answer += str(remain)
    return int(answer,3)

print(solution(45))