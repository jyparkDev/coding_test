import sys

code = {"-" : 0 , "\\": 1, "(" : 2, "@" : 3, "?" : 4, ">" : 5, "&" : 6, "%" : 7, "/" : -1}

while(True):
    str = sys.stdin.readline().rstrip()
    if str == "#": break
    count = len(str) - 1
    sum = 0

    for i in str:
        sum += code[i] * (8 ** count)
        count -= 1

    print(sum)