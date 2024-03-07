

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

 class Main {
    public static void main(String[] args) throws IOException {

        String[] buf = input();

        BufferedWriter bw = calc(buf);

        bw.flush();
        bw.close();
    }

    public static BufferedWriter calc(String[] buf) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = buf.length;
        Deque<Integer> deq = new LinkedList<>();

        for (int i = 0 ; i < n ; i++){
            String target = buf[i];

            if (target.startsWith("push_back")){
                deq.addLast(Integer.parseInt(target.split(" ")[1]));
            }else if(target.startsWith("push_front")){
                deq.addFirst(Integer.parseInt(target.split(" ")[1]));
            }else if(target.equals("pop_front")){
                int rm = deq.isEmpty() ? -1 : deq.pollFirst();
                bw.write(rm+"\n");
            }else if(target.equals("pop_back")){
                int rm = deq.isEmpty() ? -1 : deq.pollLast();
                bw.write(rm + "\n");
            }else if(target.equals("size")){
                bw.write(deq.size() + "\n");
            }else if(target.equals("empty")){
                int rm = deq.isEmpty() ? 1 : 0 ;
                bw.write(rm + "\n");
            }else if (target.equals("front")){
                int rm = deq.isEmpty() ? -1 : deq.peekFirst();
                bw.write(rm + "\n");
            }else{
                int rm = deq.isEmpty() ? -1 : deq.peekLast();
                bw.write(rm + "\n");
            }
        }

        return bw;
    }




    public static String[] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] buf = new String[N];

        for(int i = 0 ; i < N ; i++){
            buf[i] = br.readLine();
        }
        return buf;
    }
}
