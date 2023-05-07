import sys

while True:
  str = sys.stdin.readline().rstrip()
  if str == "0 0 0":
      break
  numArr = list(map(int, str.split()))
  c = max(numArr)
  numArr.remove(c)
  if (numArr[0] ** 2 + numArr[1] ** 2) == c ** 2 :
    print("right")
  else:
    print("wrong")