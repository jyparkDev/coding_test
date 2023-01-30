import java.util.Arrays;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        StringBuilder sb = new StringBuilder();
        String[][] tmp = new String[n][n];
        String[][] tmp2 = new String[n][n];
        String result[] = new String[n];
        int a = 0 ,b = 0;
        for (int i = 0 ; i < tmp.length;i++){
            String s1 =  Integer.toBinaryString(arr1[i]);
            String s2 =  Integer.toBinaryString(arr2[i]);
            s1 = "0".repeat(n-s1.length())+s1;
            s2 = "0".repeat(n-s2.length())+s2;
            tmp[i] = s1.split("");
            tmp2[i] = s2.split("");
        }
        System.out.println(Arrays.deepToString(tmp));
        System.out.println(Arrays.deepToString(tmp2));
        while(a < n){
            if(b == n){
                result[a] = sb.toString();
                sb.setLength(0);
                b = 0; a++;continue;
            }
            if(tmp[a][b].equals(tmp2[a][b])){
               if(tmp[a][b].equals("1"))
                   sb.append("#");
               else
                   sb.append(" ");
            }else{
                sb.append("#");
            }
            b++;
        }
        return result;
    }
}