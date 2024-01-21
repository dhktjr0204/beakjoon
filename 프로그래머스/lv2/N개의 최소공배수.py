def solution(arr):
    lcm=arr[0]*arr[1]//gcd(arr[0],arr[1])
    for i in range(2,len(arr)):
        n_gcd=gcd(lcm,arr[i])
        lcm=lcm*arr[i]//n_gcd
    return lcm

def gcd(a,b):
    while a!=0:
        a,b=b%a,a
    return b

print(solution([2,6,8,14]))