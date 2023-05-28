import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    static void input() {
        N = scan.nextInt();
        students = new Student[N];
        for (int i = 0 ; i < N ; i++){
            String name = scan.next();
            int korean = scan.nextInt();
            int english = scan.nextInt();
            int math = scan.nextInt();
            students[i] = new Student(name,korean,math,english);
        }
    }

    static int N;
    static Student[] students;

    public static void main(String[] args) {
        input();

        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student.name);
        }
    }



    static class Student implements Comparable<Student>{
        String name;
        int korean;
        int math;
        int english;

        public Student(String name, int korean, int math, int english) {
            this.name = name;
            this.korean = korean;
            this.math = math;
            this.english = english;
        }

        @Override
        public int compareTo(Student o) {
            if (o.korean == this.korean){
                if (o.english == this.english){
                    if (o.math == this.math){
                        int num = Math.min(o.name.length(), this.name.length());
                        for (int i = 0 ; i < num ; i++){
                            if(o.name.charAt(i) != this.name.charAt(i))
                                return this.name.charAt(i) - o.name.charAt(i);
                        }
                        return this.name.length() - o.name.length();
                    }
                    return o.math - this.math;
                }
                return this.english - o.english;
            }
            return o.korean - this.korean;
        }
    }

    static class FastReader{
        BufferedReader br ;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next(){
            while(st == null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }

        long nextLong(){
            return Long.parseLong(next());
        }

        double nextDouble(){
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";

            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }
    }
}
