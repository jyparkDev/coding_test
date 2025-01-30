class Solution {
    public int solution(int a, int b) {
        
        int n1 = a;
        int n2 = b;
        int digit = 2;

        while (digit <= n1 && digit <= n2){

            if( n1 % digit == 0 && n2 % digit == 0){
                n1 /= digit;
                n2 /= digit;
                digit = 2;
                continue;
            }
            digit++;
        }

        while (n2 > 1){
            if(n2 % 5 != 0 && n2 % 2 != 0){
                return 2;
            }
            if(n2 % 5 == 0){
                n2 /= 5;
            }else if(n2 % 2 == 0){
                n2 /= 2;
            }
        }
        
        return 1;
    }
}