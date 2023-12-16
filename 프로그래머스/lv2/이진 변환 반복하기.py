def solution(s):
    total_count=0
    zero_count=0
    while True:
        if int('0b'+s,2)==1:
            break
        zero_count+=s.count('0')
        s=str(bin(s.count('1')))[2:]
        total_count+=1
    answer = [total_count,zero_count]
    return answer

print(solution("110010101001"))