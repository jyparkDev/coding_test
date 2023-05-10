import sys
n = int(input())

rope = list()
max = 0
for _ in range(n):
    rw = int(sys.stdin.readline().rstrip())
    rope.append(rw)

rope.sort(reverse=True)
while len(rope) > 0:
    k = len(rope)
    m = rope[-1]
    if (m * k) >= max:
        max = (m * k)
    rope.pop(k -1)

print(max)