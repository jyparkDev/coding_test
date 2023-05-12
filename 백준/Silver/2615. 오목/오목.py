import sys


def check(x, y):
    target = board[x][y]
    for k in range(4):
        cnt = 1
        nx = x + dx[k]
        ny = y + dy[k]

        while 0 <= nx < n and 0 <= ny < n and target == board[nx][ny]:
            cnt += 1

            if cnt == 5:
                if 0 <= x - dx[k] < 19 and 0 <= y - dy[k] < 19 and board[x - dx[k]][y - dy[k]] == target:
                    break
                if 0 <= nx + dx[k] < 19 and 0 <= ny + dy[k] < 19 and board[nx + dx[k]][ny + dy[k]] == target:
                    break
                print(target)
                print(x + 1, y + 1)
                exit(0)
            nx += dx[k]
            ny += dy[k]

board = [list(map(int, sys.stdin.readline().split())) for _ in range(19)]
n = 19
# U D R L
dx = [0, 1, 1, -1]
dy = [1, 0, 1, 1]

for i in range(n):
    for j in range(n):
        if board[i][j] != 0:
            check(i, j)
print(0)