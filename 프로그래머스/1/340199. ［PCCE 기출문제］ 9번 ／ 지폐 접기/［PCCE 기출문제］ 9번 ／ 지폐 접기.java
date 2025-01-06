class Solution {
    public int solution(int[] wallet, int[] bill) {
        int count = 0;
        int max = Math.max(wallet[0], wallet[1]);
        int min = Math.min(wallet[0], wallet[1]);
        
        while(true){
            
            if(max >= Math.max(bill[0],bill[1])
               && min >= Math.min(bill[0],bill[1])){
                break;
            }
            
            if(bill[0] > bill[1]){
                bill[0] /= 2;
            } else{
                bill[1] /= 2;
            }
            count++;
            
        }
        return count;
    }
}