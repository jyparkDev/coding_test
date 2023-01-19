# BackJoon Algorithm 표준 형식

## C99
+ 언어 번호: 0
+ 컴파일: gcc Main.c -o Main -O2 -Wall -lm -static -std=gnu99 -DONLINE_JUDGE -DBOJ
+ 실행: ./Main
+ 버전: gcc (GCC) 10.2.0

```C
#include <stdio.h>
int main() {
	int a, b;
	scanf("%d %d",&a,&b);
	printf("%d\n",a+b);
	return 0;
}
```

## JAVA11
+ 언어 번호: 93
+ 컴파일: javac -release 11 -J-Xms1024m -J-Xmx1920m -J-Xss512m -encoding UTF-8 Main.java
+ 실행: java -Xms1024m -Xmx1920m -Xss512m -Dfile.encoding=UTF-8 -XX:+UseSerialGC -DONLINE_JUDGE=1 -DBOJ=1 Main
+ 버전: openjdk 15 2020-09-15
+ 시간 제한: ×2+1 초
+ 메모리 제한: ×2+16 MB
```JAVA
import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
	}
}
```

## PYTHON3
+ 언어 번호: 28
+ 컴파일: python3 -c "import py_compile; py_compile.compile(r'Main.py')"
+ 실행: python3 Main.py
+ 버전: Python 3.9.0
+ 시간 제한: ×3+2 초
+ 메모리 제한: ×2+32 MB
```python
a, b = map(int, input().split())
print(a+b)
```

## Kotlin (JVM)
+ 언어 번호: 69
+ 컴파일: kotlinc-jvm -J-Xms1024m -J-Xmx1920m -J-Xss512m -include-runtime -d Main.jar Main.kt
+ 실행: java -Xms1024m -Xmx1920m -Xss512m -Dfile.encoding=UTF-8 -XX:+UseSerialGC -DONLINE_JUDGE=1 -DBOJ=1 -jar Main.jar
+ 버전: kotlinc-jvm 1.4.21 (JRE 1.8.0_201-b09)
+ 런타임: Java 8
+ 시간 제한: ×2+1 초
+ 메모리 제한: ×2+16 MB
```kotlin
import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    println(a+b)
}
```




> [참조링크](https://www.acmicpc.net/help/language/all)