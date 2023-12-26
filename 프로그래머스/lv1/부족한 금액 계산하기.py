def solution(price, money, count):
    total_count=sum(i for i in range(1,count+1))
    answer = price*total_count-money
    if answer<=0:
        return 0
    return answer

print(solution(3,20,4))