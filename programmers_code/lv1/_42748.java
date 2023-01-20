package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 */
public class _42748 {
    static int solution(String dartResult) {
        String[] scoreStr = divideScore(dartResult);
        int[] score = new int[3];
        for(int i = 0 ; i < scoreStr.length;i++){
            String[] addScoreStr = divideAddScore(scoreStr[i]);
            score[i] = Integer.parseInt(addScoreStr[0]);
            if(addScoreStr[1].equals("S")){
                score[i] *= 1;
            }else if(addScoreStr[1].equals("D")){
                score[i] = score[i] * score[i];
            }else{
                score[i] = score[i] * score[i] * score[i];
            }

            if(addScoreStr[2] != null){
                if(addScoreStr[2].equals("*")){
                    if(i > 0 ){
                        score[i-1] *=2;
                    }
                    score[i] *=  2;
                }else if(addScoreStr[2].equals("#")){
                    score[i] *= -1;
                }
            }
        }
        return score[0]+score[1]+score[2];
    }
    static String[] divideAddScore(String scoreStr){
        StringBuilder sb = new StringBuilder();
        String[] tmp = new String[3];
        for(int i = 0 ; i < scoreStr.length();i++){
            if(scoreStr.charAt(i) == 'D' || scoreStr.charAt(i) == 'S' || scoreStr.charAt(i) == 'T'){
                tmp[0] = sb.toString();
                tmp[1] = new String(scoreStr.charAt(i)+"");
                if(i < scoreStr.length()-1){
                    tmp[2] = new String(scoreStr.charAt(i+1)+"");
                }
                break;
            }else{
                sb.append(scoreStr.charAt(i));
            }
        }
        return tmp;
    }
    static String[] divideScore(String dartResult){
        StringBuilder sb = new StringBuilder();
        String tmp[] = new String[3];
        for(int i = 0,k=0 ; i < dartResult.length();i++){
            if(k == 2){
                tmp[k] = dartResult.substring(i);
                break;
            }
            if(dartResult.charAt(i) =='S' || dartResult.charAt(i) =='D' || dartResult.charAt(i) =='T'){
                if(dartResult.charAt(i+1) == '#' || dartResult.charAt(i+1) == '*'){
                    sb.append(dartResult.charAt(i));
                    sb.append(dartResult.charAt(i+1));
                    i++;
                }else{
                    sb.append(dartResult.charAt(i));
                }
                tmp[k++] = sb.toString();
                sb.setLength(0);
            }else{
                sb.append(dartResult.charAt(i));
            }
        }
        return tmp;
    }

    public static void main(String[] args)  {
        System.out.println("Main.main");
        int result = solution("1S*2T*3S");
        System.out.println("result = " + result);
//        System.out.println("result = " + Arrays.toString(result));
    }
}
