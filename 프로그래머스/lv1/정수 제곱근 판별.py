def solution(n):
    answer = 0
    num=n**0.5
    if num==int(num):
        answer=int((num+1)**2)
    else:
        answer=-1
    return answer

print(solution(3))