def solution(n):
    answer = 0
    n_bin=bin(n)[2:]
    while True:
        n+=1
        if n_bin.count('1')==bin(n)[2:].count('1'):
            answer=n
            break
    return answer

print(solution(78))