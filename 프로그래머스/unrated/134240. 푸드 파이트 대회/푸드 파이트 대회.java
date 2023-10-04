class Solution {
    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        
        for(int i = 1 ; i < food.length ; i++){
            int c = count(food[i]);
            if(c > 0){
                sb.append(String.valueOf(i).repeat(c));
            }
        }
        String suffix = sb.reverse().toString();
        sb.reverse().append('0').append(suffix);
        return sb.toString();
    }
    
    public int count(int num){
        return num / 2;
    }
}