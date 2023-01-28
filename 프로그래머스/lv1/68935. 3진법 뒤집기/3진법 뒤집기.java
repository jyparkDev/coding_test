class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            int num = n % 3;
            sb.append(num);
            n /= 3;
        }
        String[] a = sb.toString().split("");
        for(int i = a.length - 1, k = 0 ; i >= 0 ; i--)
            answer += (Integer.parseInt(a[i]) * Math.pow(3,k++) );
        return answer;
    }
}