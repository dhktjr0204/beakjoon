import sys
import heapq


n=int(sys.stdin.readline())
leftHeap=[]
rightHeap=[]
answer=[]

for i in range(n):
    a=(int(sys.stdin.readline()))
    if len(leftHeap)==len(rightHeap):
        #내림차순
        heapq.heappush(leftHeap, (-a,a))
    else:
        #오름차순
        heapq.heappush(rightHeap,(a,a))
    if rightHeap and leftHeap[0][1]>rightHeap[0][0]:
        min=heapq.heappop(rightHeap)[0]
        max=heapq.heappop(leftHeap)[1]
        heapq.heappush(leftHeap,(-min,min))
        heapq.heappush(rightHeap,(max,max))
    
    answer.append(leftHeap[0][1])

for j in answer:
    print(j)
