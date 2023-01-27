class Solution {
    public int solution(int[][] sizes) {
        if(sizes.length == 1) return sizes[0][0] * sizes[0][1];
        int max_width = 0 , max_height = 0;

        for(int i = sizes.length - 1 ; i >=0; i--){
            int max1 = (sizes[i][0] >= sizes[i][1]) ? sizes[i][0] : sizes[i][1];
            int min1 = (sizes[i][0] < sizes[i][1]) ? sizes[i][0] : sizes[i][1];
            max_width = max1 >= max_width ? max1 :max_width;
            max_height = min1 >= max_height ? min1 :max_height;

        }
        return max_width*max_height;
    }
}