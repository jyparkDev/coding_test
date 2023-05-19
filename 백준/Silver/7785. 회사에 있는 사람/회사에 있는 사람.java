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
        Map<String,String> map = new HashMap<>();
        while (N-- > 0){
            String[] in = br.readLine().split(" ");
            map.put(in[0],in[1]);
        }
        ArrayList<Member> members = new ArrayList<>();

        map.forEach((n,s)->{
            if(s.equals("enter")) members.add(new Member(n));
        });

        Collections.sort(members);
        for (Member m : members) {
            System.out.println(m.name);
        }
    }
}