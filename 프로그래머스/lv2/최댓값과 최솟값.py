def solution(s):
    s=list(map(int,s.split()))
    s.sort()
    answer = str(s[0])+' '+str(s[-1])
    return answer

print(solution("-1 -2 -3 -4"))