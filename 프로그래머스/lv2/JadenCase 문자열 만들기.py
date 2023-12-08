def solution(s):
    s=list(s.split(' '))
    answer=[]
    for i in s:
        if i:
            answer.append(i[0].upper()+i[1:].lower())
        else:
            answer.append(i)
    return ' '.join(answer)

print(solution("3people unFollowed me"))