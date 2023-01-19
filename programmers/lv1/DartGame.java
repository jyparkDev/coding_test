package programmers.lv1;

import java.util.Scanner;

public class DartGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String dartResult = s.nextLine();
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
                    if(i > 0){
                        score[i-1] *= -1;
                    }
                    score[i] *= -1;
                }
            }
        }
        System.out.println(score[0]+score[1]+score[2]);
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
}
