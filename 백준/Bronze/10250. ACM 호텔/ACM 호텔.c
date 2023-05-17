#include<stdio.h>

int main()
{
    int a;
	int W, H, N;
	scanf("%d", &a);
	for (int i = 0; i < a; i++)
	{
		scanf("%d %d %d", &H, &W, &N);
        if (N % H != 0)
			printf("%d\n", N % H * 100 + (N / H + 1));
		else
			printf("%d\n", H * 100 + (N / H));
	}
    return 0;
}