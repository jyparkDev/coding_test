class Solution {
    public int solution(int a, int b, int n) {
       int add_bottle = 0; // 보너스병
        do{
            int conSumBottle = n / a;
            int add = conSumBottle*b;
            int sub = (conSumBottle*a);
            n = n + -sub + add;
            add_bottle += add;
        }while(n >= a);

        return add_bottle;
    }
}