import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            int n = sc.nextInt();
            arr[i] = n;
            set.add(n);
        }

        Map<Integer,Integer> map = new HashMap<>();
        int idx = 0;
        Iterator<Integer> iter = set.iterator();

        while (iter.hasNext()){
            Integer next = iter.next();
            map.put(next,idx++);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0 ; i < arr.length ; i++){
            bw.write(map.get(arr[i])+" ");
        }
        bw.flush();
    }
}
