import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Member implements Comparable<Member>{
        String name;

        public Member(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Member o) {
            return o.name.compareTo(this.name);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> memberSet = new HashSet<>();
        while (N-- > 0) {
            String[] in = br.readLine().split(" ");
            if (in[1].equals("leave")) {
                memberSet.remove(in[0]);
                continue;
            }
            memberSet.add(in[0]);
        }

        memberSet.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        }).forEach(s -> System.out.println(s));
    }
}