import java.time.LocalDate;
class Solution {
    public int solution(int[] date1, int[] date2) {
        int result = LocalDate.of(date1[0], date1[1], date1[2])
            .compareTo(LocalDate.of(date2[0], date2[1], date2[2]));
        return result < 0 ? 1 : 0;
        
    }
}