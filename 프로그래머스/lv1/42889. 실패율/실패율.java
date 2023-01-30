import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] users = new int[N]; // 단계별 누적인원
        int[] stayUser = new int[N]; // 단계 머무르는 인원
        for (int stage : stages)
        {
            if (stage != N + 1)
            {
                stayUser[stage - 1]++;
                for (int i = 0; i < stage; i++)
                {
                    users[i]++;
                }
            }
            else
            {
                for (int i = 0; i < users.length; i++)
                {
                    users[i]++;
                }
            }
        }
        ArrayList<Double[]> fail = new ArrayList<>();
        for (int i = 0 ; i < N ; i++){
            double rate = Double.isNaN((double) stayUser[i] / users[i]  )?0 : (double) stayUser[i] / users[i];
            fail.add(new Double[]{(double)i+1 ,rate});
        }
        fail.sort((d1,d2)->Double.compare(d2[1],d1[1]));
        return fail.stream().mapToInt(d -> d[0].intValue()).toArray();
    }
}