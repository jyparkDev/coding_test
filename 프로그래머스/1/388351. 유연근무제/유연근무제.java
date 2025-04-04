class Solution {
     public int solution(int[] schedules, int[][] timelogs, int startday) {


        calcSafeTime(schedules);
        return countPresentMember(schedules, timelogs, startday);
    }

    private int countPresentMember(int[] schedules, int[][] timelogs, int startday){

        boolean[] outMember = new boolean[schedules.length];

        int count = schedules.length;

        for (int d = 0 ; d < timelogs[0].length; d++, startday++){
            if(startday % 7 == 6 || startday % 7 == 0){
                continue;
            }
            for(int m = 0 ; m < schedules.length; m++){
                if (outMember[m]){
                    continue;
                }
                if(timelogs[m][d] > schedules[m]){
                    outMember[m] = true;
                    count--;
                }
            }
        }
        return count;
    }

    private void calcSafeTime(int[] schedules){
        for (int i = 0 ; i < schedules.length ; i++){
            int hour = schedules[i] / 100;
            int min = schedules[i] % 100 + 10;

            if (min / 60 > 0) {
                hour += 1;
                min -= 60;
            }
            schedules[i] = hour * 100 + min;
        }
    }
}