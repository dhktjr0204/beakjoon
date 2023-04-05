S=input()

str=set()

for i in range(len(S)):
    for j in range(i, len(S)):
        temp=S[i:j+1]
        str.add(temp)
print(len(str))