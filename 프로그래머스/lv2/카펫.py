def solution(brown, yellow):
    answer = []
    for i in range(1,int(yellow**0.5)+1):
        if yellow%i==0:
            #가로가 세로보다 더김, 노란색의 가로, 세로 길이 구함
            a,b=yellow//i,i
            #갈색은 노란색 테두리에 있으니까 양옆 붙고 네모 4칸이 남으니 4 더해줌
            if (a+b)*2+4==brown:
                answer=[a+2,b+2]
    return answer

print(solution(24,24))