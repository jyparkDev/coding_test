import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

/*
첫째 줄에 메시지의 길이 N과 C가 주어진다. (1 ≤ N ≤ 1,000, 1 ≤ C ≤ 1,000,000,000)
둘째 줄에 메시지 수열이 주어진다.
 */
public class Main {

    static class Bean{
        int no;
        int count;
        int idx;

        public Bean(int no, int count, int idx) {
            this.no = no;
            this.count = count;
            this.idx = idx;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[N];
        Map<Integer,Integer> countMap = new HashMap<>();
        Map<Integer,Integer> indexMap = new HashMap<>();

        int idx = 0;

        for (int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
            if (!set.contains(arr[i])){
                indexMap.put(arr[i], idx++);
                countMap.put(arr[i], 1);
                set.add(arr[i]);
                continue;
            }
            countMap.put(arr[i], countMap.get(arr[i]) + 1);
        }

        Bean[] bean = new Bean[N];
        for(int i = 0 ; i < N ; i++)
            bean[i] = new Bean(arr[i],countMap.get(arr[i]),indexMap.get(arr[i]));

        Arrays.sort(bean, new Comparator<Bean>() {
            @Override
            public int compare(Bean o1, Bean o2) {
                if (o1.count == o2.count)
                    return o1.idx - o2.idx;
                return o2.count - o1.count;
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Bean b : bean) {
            bw.write(b.no + " ");
        }
        bw.flush();
        bw.close();

    }
}
