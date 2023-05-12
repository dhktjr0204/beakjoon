import sys

n,m=map(int,sys.stdin.readline().split())

words={}
for i in range(n):
    word=sys.stdin.readline().strip() 
    if len(word)>=m:
        if word in words:
            words[word]+=1
        else:
            words[word]=1
words=sorted(words.items(), key=lambda x: (-x[1], -len(x[0]), x[0]))

for i in words:
    print(i[0])