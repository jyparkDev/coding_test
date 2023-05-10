str = input()

count = 0
s = ""
for i in str:
    if i == "X":
        count += 1
    else:
        if count % 2 != 0:
            s = -1
            break
        s += "AAAA" * (count // 4)
        count %= 4
        s += "BB" * (count // 2)
        count = 0
        s += "."

if count >= 0:
    if count % 2 != 0:
        s = -1
    else:
        s += "AAAA" * (count // 4)
        count %= 4
        s += "BB" * (count // 2)
        
print(s)
