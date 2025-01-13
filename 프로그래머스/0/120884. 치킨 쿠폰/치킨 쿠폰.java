class Solution {
    public int solution(int chicken) {
        
        int totalService = 0;
        int couponNum = chicken;
        
        while(couponNum / 10 > 0){
            
            int c = couponNum / 10; 
            int r = couponNum % 10; 
            
            totalService += c; 
            couponNum = c + r; 
            
        }
        
        
    
        
        return totalService;
    }
}