package programmers.lv1;

public class _12928 {
    public static int solution(int n) {
        int answer = n ;
        for(int i = 1 ; i <= n/2 ; i++)
            if(n % i == 0) answer += i;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Main.main");
        int result = solution(5);
//        System.out.println("result = " + Arrays.toString(result));
        System.out.println("result = " + result);
    }
}
