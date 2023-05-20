import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    static class Meeting{
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Meeting[] meetings = new Meeting[N];
        for (int i = 0; i < meetings.length; i++)
            meetings[i] = new Meeting(sc.nextInt(), sc.nextInt());

        Arrays.sort(meetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if(o1.end == o2.end)
                    return o1.start - o2.start;
                return o1.end - o2.end;
            }
        });

        int cnt = 0 , ended = 0 ;

        for (Meeting meeting : meetings) {
            if(ended <= meeting.start ){
                cnt++;
                ended = meeting.end;
            }
        }
        System.out.println(cnt);
    }
}
