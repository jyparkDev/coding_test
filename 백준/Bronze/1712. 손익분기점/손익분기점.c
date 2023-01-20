#include<stdio.h>

int main()
{    
    int a,b,c;
    scanf("%d %d %d", &a, &b, &c);
    if(c <= b) printf("%s", "-1");
    else printf("%d", a/(c-b) + 1);
    return 0;
}