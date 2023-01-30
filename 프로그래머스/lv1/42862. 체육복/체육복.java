import java.util.Arrays;
class Solution {
     private static void countNum(int[] sArr,int[] lost,int[] reserve){
        for (int i : lost) { // 체
            sArr[i-1] -= 1;
        }
        for (int i : reserve){
            sArr[i-1] += 1;
        }
    }

    private void borrow(int[] sArr){
        for(int i = 0 ; i < sArr.length ;i++){
            if(i==0){
                if (sArr[i] == 0 || sArr[i] == -1){
                    continue;
                }else if(sArr[i] == 1 && sArr[i+1] == -1){
                    sArr[i] -= 1; sArr[i+1] += 1;
                }
            }else if (i == sArr.length-1){
                if(sArr[i] == 1 && sArr[i-1] == -1){
                    sArr[i] -= 1; sArr[i-1] += 1;
                }
                break;
            }else{
                if(sArr[i] == 0) continue;
                else if(sArr[i] == 1){
                    if(sArr[i-1] == -1){
                        sArr[i] -= 1; sArr[i-1] += 1;
                    }else if(sArr[i+1] == -1){
                        sArr[i] -= 1; sArr[i+1] += 1;
                    }
                }else{
                    if (sArr[i-1] == 1){
                        sArr[i-1] -= 1; sArr[i] += 1;
                    }else if(sArr[i+1] == 1){
                        sArr[i+1] -= 1; sArr[i] += 1;
                    }
                }
            }
        }
    }
    public int solution(int n, int[] lost, int[] reserve) {
        int sArr[] = new int[n];
        countNum(sArr,lost,reserve);
        borrow(sArr);

        return (int)Arrays.stream(sArr).filter(x-> x != -1).count();
    }
}