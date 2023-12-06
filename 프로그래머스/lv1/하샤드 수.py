def solution(x):
    answer = True
    haxad=0
    for i in str(x):
        haxad+=int(i)
    if x%haxad!=0:
        answer=False

    return answer

print(solution(11))