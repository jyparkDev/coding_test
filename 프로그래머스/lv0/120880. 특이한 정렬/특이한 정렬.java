import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        ArrayList<Integer> list = new ArrayList<>(); // sample list
        ArrayList<Integer> answer_list = new ArrayList<>(); // 기준 정렬 된 list
        boolean check = false; // 기준에 n 여부 체크
        int cp = 0, lp , rp;// n 위치 , n 왼쪽, n 오른쪽 포인트
        // 배열에 n이 있는지 없는지 체크
        for (int i : numlist) {
            if(i == n) check = !check; //n 있으면 check = true
            list.add(i);
        }
        // 없을 시 정렬을 위해 임시 저장
        if(!check) list.add(n);
        // 오름 정렬
        Collections.sort(list);
        //n이 기존 배열에 있을 시 가장 앞에 추가
        //n의 인덱스 찾기
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) == n) {
                cp = i;
                break;
            }
        }
        lp = cp -1; // 기준 왼쪽
        rp = cp+1; // 기준 오른쪽
        answer_list.add(list.get(cp)); // 가장 앞에 기준 넣기
        // n 기준 정렬
        while( !((lp < 0) && (list.size()-1 < rp))){
            //lp,rp 중 다음 요소가 없을 시
            if(lp < 0 || rp >= list.size()){
                if(lp < 0){
                    for( ; rp < list.size() ;rp++){
                        answer_list.add(list.get(rp));
                    }
                }else{
                    for( ; lp >= 0 ;lp--){
                        answer_list.add(list.get(lp));
                    }
                }
            }
            else{
                int l_val = list.get(cp)-list.get(lp);
                int r_val = list.get(rp)-list.get(cp);
                if(l_val < r_val){
                    answer_list.add(list.get(lp--));
                }else if(l_val > r_val){
                    answer_list.add(list.get(rp++));
                }else{
                    answer_list.add(list.get(rp++));
                    answer_list.add(list.get(lp--));
                }
            }
        }
        if (!check) answer_list.remove(0);
        return answer_list.stream().mapToInt(i -> i).toArray();
    }
}