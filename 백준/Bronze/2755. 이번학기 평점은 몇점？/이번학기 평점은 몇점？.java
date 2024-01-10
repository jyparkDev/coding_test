import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Double> scoreMap = init();

        int N = Integer.parseInt(br.readLine());
        int totalGrade = 0;
        double totalScore = 0;

        for(int i = 0 ; i < N ; i++){
            String[] input = br.readLine().split(" ");
            int grade = Integer.parseInt(input[1]);
            double score = scoreMap.get(input[2]);

            totalGrade += grade;
            totalScore += (grade * score);

        }

        System.out.printf("%.2f", (totalScore/totalGrade));

    }

    private static Map<String,Double> init(){
        Map<String,Double> map = new HashMap<>();
        map.put("A+",4.3); map.put("A0",4.0); map.put("A-",3.7);
        map.put("B+",3.3); map.put("B0",3.0); map.put("B-",2.7);
        map.put("C+",2.3); map.put("C0",2.0); map.put("C-",1.7);
        map.put("D+",1.3); map.put("D0",1.0); map.put("D-",0.7);
        map.put("F",0.0);
        return map;
    }
}