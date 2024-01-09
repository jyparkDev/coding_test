import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int grade = 5;
        String[] classRoom = new String[N];

        // 각 학생 당 학기 입력 받기 입력 받기
        for (int i = 0 ; i < N ; i++){
            classRoom[i] = br.readLine().replace(" ","");
        }

        Set<Integer> same[] = new HashSet[N];
        for (int i = 0 ; i < N ; i++){
            same[i] = new HashSet<>();
        }

        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < N - 1; j++){
                for (int k = j + 1 ; k < N ; k++){
                    if(classRoom[j].charAt(i) == classRoom[k].charAt(i)){
                        same[j].add(k);
                        same[k].add(j);
                    }
                }
            }
        }

        int maxCount = 0;
        int num = 1;

        for (int i = 0 ; i < N ; i++){
            int size = same[i].size();

            if (size > maxCount){
                num = (i+1);
                maxCount = size;
            }
        }

        System.out.println(num);


    }
}
