import heapq

def solution(food_times,k):
    #전체 음식을 먹는 시간보다 k가 크거나 같으면 -1
    if sum(food_times)<=k:
        return -1
    
    q=[]
    #시간이 작은 음식부터 빼야되므로 q를 사용
    for i in range(len(food_times)):
        heapq.heappush(q,(food_times[i],i+1))

    sum_value=0 #먹기 위해 사용된 시간
    previous=0 #직전에 다 먹은 음식 시간
    length=len(food_times) #남은 음식 개수

    #먹기 위해 사용된 시간+ (현재 음식 시간-이전 음식 시간)*현재 음식 개수
    #만약 남은 시간이 3초이고 남은 음식 개수는 2, 제일 작은 시간의 남은 음식이 2라면 4초가 걸려야되는데 넘기때문에 종료
    while sum_value+((q[0][0]-previous)*length)<=k:
        #시간이 제일 작은 음식 뺀다
        now=heapq.heappop(q)[0]
        #now를 먹는데 걸리는 시간*남은 음식 개수
        sum_value+=(now-previous)*length
        #음식 다 먹었으므로 하나 뺀다.
        length-=1
        #먹고 난 음식 개수를 빼줘야되므로 저장
        previous=now
    
    result=sorted(q,key=lambda x:x[1])
    return result[(k-sum_value)%length][1]

print(solution([3,1,2],5))