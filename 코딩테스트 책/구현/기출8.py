import sys
n=sys.stdin.readline().rstrip()

sum=0
word=[]
for i in n:
    if i.isalpha():
        word.append(i)
    else:
        sum+=int(i)
        
word.sort()

result=''.join(word)

print(result,end='')
print(sum)

