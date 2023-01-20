import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] str = new String[n];
        for(int i = 0 ; i < n ; i++){
            str[i] = s.next();
        }
        Arrays.stream(str).sorted( new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()){
                    return o1.length() - o2.length();
                }
                return o1.compareTo(o2);
            }
        }).distinct().forEach(i -> System.out.println(i));
    }
}