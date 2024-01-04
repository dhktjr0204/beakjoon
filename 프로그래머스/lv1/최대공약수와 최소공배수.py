def solution(n, m):
    n_m_gcd=gcd(n,m)
    answer = [n_m_gcd,n*m//n_m_gcd]
    return answer

def gcd(a,b):
    while a!=0:
        a,b=b%a,a
    return b
    

print(solution(3,12))