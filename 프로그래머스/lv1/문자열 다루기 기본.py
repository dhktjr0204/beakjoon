def solution(s):
    answer = True
    if len(s)==4 or len(s)==6:
        for i in s:
            if 65<=ord(i)<=122:
                answer=False
                break
    else:
        answer=False
    return answer

print(solution("a234"))