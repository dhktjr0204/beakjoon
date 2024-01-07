def solution(t, p):
    answer = 0
    num_list=[]
    for i in range(len(t)-len(p)+1):
        num_list.append(t[i:i+len(p)])
    for i in num_list:
        if int(i)<=int(p):
            answer+=1
    return answer

print(solution("3141592","271"))