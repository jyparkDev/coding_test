class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int cp = 0;

        while(cp < section.length){
            int num = section[cp];
            count++;
            for(int l = num, r = l + m ;  l  < r && l <= n ; l++){
                if(section[cp] == l){
                    cp++;
                }
                if( cp >= section.length) break;
            }
        }
        
        
        return count;
    }
}