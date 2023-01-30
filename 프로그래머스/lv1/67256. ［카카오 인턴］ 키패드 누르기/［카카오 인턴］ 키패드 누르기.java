class Solution {
    public String solution(int[] numbers, String hand) {
       StringBuilder sb = new StringBuilder();
        int hands[] = new int[]{10,12};
        for (int n : numbers){
            if(n == 0) n =11;
            if(n % 3  == 1){ //왼손 키패드
                hands[0] = n;
                sb.append("L");
            }
            else if (n % 3  == 0) {  //오른손 키패드
                hands[1] = n;
                sb.append("R");
            }
            else{
                int result = choice(hands,n);
                if(result == 0){
                    if(hand.equals("left")){
                        sb.append("L");
                        hands[0] = n;
                    }
                    else{
                        sb.append("R");
                        hands[1] = n;
                    }
                }else if(result < 0){ // L > R -> R / L < R -> L
                    sb.append("L");
                    hands[0] = n;
                }else{
                    sb.append("R");
                    hands[1] = n;
                }
            }
        }
        return sb.toString();
    }

    private static int choice(int[] hands , int num){

        int leftNum = 0, rightNum = 0;
        int leftpos = hands[0], rightpos = hands[1];
        while (true){
            if (hands[0] % 3 == 1){
                if(leftpos + 1 == num)  {
                    leftNum++;
                    break;
                }
                if(leftpos  > num){
                    leftNum++;
                    leftpos-=3;
                }else {
                    leftNum++;
                    leftpos+=3;
                }
            }else{
                if (leftpos == num) {
                    break;
                }else if(leftpos < num) {
                    leftpos += 3;
                    leftNum++;
                }else{
                    leftpos -= 3;
                    leftNum++;
                }
            }

        }
        while (true){
            if (rightNum > leftNum) return -1;
            if(hands[1] % 3 == 0){
                if(rightpos - 1 == num)  {
                    rightNum++;
                    break;
                }
                if(rightpos  > num){
                    rightNum++;
                    rightpos-=3;
                }else {
                    rightNum++;
                    rightpos+=3;
                }
            }else{
                if (rightpos == num) {
                    break;
                }else if(rightpos < num) {
                    rightpos += 3;
                    rightNum++;
                }else{
                    rightpos -= 3;
                    rightNum++;
                }
            }

        }
        return leftNum - rightNum;
    }
}