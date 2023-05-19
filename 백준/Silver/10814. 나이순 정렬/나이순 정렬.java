import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

   static class Member{
        int age;
        String name;
        int idx;

        public Member(int age, String name, int idx) {
            this.age = age;
            this.name = name;
            this.idx = idx;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Member[] members = new Member[N];

        for(int i = 0 ; i < N ; i++){
            int age = sc.nextInt();
            String name = sc.next();
            members[i] = new Member(age,name,i);
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if(o1.age == o2.age)
                    return o1.idx - o2.idx;
                return o1.age - o2.age;
            }
        });
        for (Member m : members) {
            System.out.println(m.age + " " + m.name);
        }
    }
}