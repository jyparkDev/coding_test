class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; ){
            if(0<=s.charAt(i) - '0' && s.charAt(i) - '0' <= 9 ){
                sb.append(s.charAt(i));
                i++;
            }
            else{
                if(s.charAt(i) == 'z' ){
                    sb.append('0');
                    i += "zero".length();
                }else if(s.charAt(i) == 'o' ){
                    sb.append('1');
                    i += "one".length();
                }else if(s.charAt(i) == 't'){
                    if(s.charAt(i+1) == 'w'){
                        sb.append('2');
                        i += "two".length();
                    }else{
                        sb.append('3');
                        i += "three".length();
                    }
                }else if(s.charAt(i) == 'f'){
                    if(s.charAt(i+1) == 'o'){
                        sb.append('4');
                        i += "four".length();
                    }else{
                        sb.append('5');
                        i += "five".length();
                    }
                }else if(s.charAt(i) == 's'){
                    if(s.charAt(i+1) == 'i'){
                        sb.append('6');
                        i += "six".length();
                    }else{
                        sb.append('7');
                        i += "seven".length();
                    }
                }else if(s.charAt(i) == 'e'){
                    sb.append('8');
                    i += "eight".length();
                }else if(s.charAt(i) == 'n'){
                    sb.append('9');
                    i += "nine".length();
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}