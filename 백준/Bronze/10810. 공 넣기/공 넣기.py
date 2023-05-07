import sys

n,m = map(int,input().split())
basket = [0 for i in range(n)]

for _ in range(m):
  i,j,k = map(int, sys.stdin.readline().rstrip().split())
  for z in range(i-1, j):
    basket[z] = k

for i in basket:
    print(i, end=" ")