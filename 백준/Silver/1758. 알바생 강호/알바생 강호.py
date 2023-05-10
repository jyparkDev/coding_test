n = int(input().rstrip())
rank = 1
ll = list()
tip = 0
for _ in range(n):
    m = int(input().rstrip())
    ll.append(m)

ll.sort(reverse=True)

for m in ll:
    tmp = m - (rank - 1)
    if tmp >= 0:
        tip += tmp
    rank += 1

print(tip)