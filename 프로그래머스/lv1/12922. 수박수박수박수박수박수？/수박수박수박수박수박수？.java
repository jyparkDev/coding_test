class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        //깔끔한 코드 만들기
        /* if(n%2==0) sb.append("수박".repeat(n/2));
        else sb.append("수박".repeat(n/2)+"수");
        */

        //성능향상시키기
        char[] sample = "수박".toCharArray();
        for(int i =  0; i < n ; i++){
            sb.append(sample[i%2]);
        }

        return sb.toString();
    }
}
