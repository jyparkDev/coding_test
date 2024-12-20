import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            if(list.size() == 0){
                list.add(arr[i]);
                continue;
            }
            
            if(list.get(list.size() - 1) == arr[i]){
                list.remove(list.size() - 1);
            }else{
                list.add(arr[i]);
            }
        }
        
        if(list.size() == 0){
            return new int[]{-1};
        }
        
        int[] stk = new int[list.size()];
        
        for(int i = 0 ; i < list.size() ; i++){
            stk[i] = list.get(i); 
        }
        
        return stk;
    }
}