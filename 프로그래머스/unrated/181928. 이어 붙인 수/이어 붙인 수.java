class Solution {
    public int solution(int[] num_list) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(int i = 0 ; i < num_list.length ; i++){
            int num = num_list[i];
            if(num % 2 == 0){
                sb1.append(num);
            }else{
                sb2.append(num);
            }
        }
        return Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
    }
}