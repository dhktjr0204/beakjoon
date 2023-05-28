n=int(input())

def star(n):
    if n==1:
        return ['*']
    
    Stars=star(n//3)
    L=[]

    for i in Stars:
        L.append(i*3)
    for i in Stars:
        L.append(i+' '*(n//3)+i)
    for i in Stars:
        L.append(i*3)
        
    return L

print('\n'.join(star(n)))