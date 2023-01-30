class Solution {
    public String solution(String new_id) {
        String str = new_id;
        str =toLowerCase(str);
        str = excludeChar(str);
        str = continuous(str);
        str = removeFirstAndLastPoint(str);
        str = emptyString(str);
        str = substringLength(str);
        str = addString(str);

        return str;
    }

    private static String toLowerCase(String str){
       return str.toLowerCase();
    }

    private static String excludeChar(String str){
        return str.replaceAll("[^a-z0-9-_.]","");
    }

    private static String continuous(String str){
        return str.replaceAll("[.]{2,}",".");
    }

    private static String removeFirstAndLastPoint(String str){

        str = str.replaceAll("^[.]","").replaceAll("[x]$","");
        return str;
    }

    private static String emptyString(String str){
        if (str.length() == 0){
            str = str.replace("", "a");
        }
        return str;
    }

    private static String substringLength(String str){
        if(str.length()  >= 16)
            str = str.substring(0,15);
        if(str.charAt(str.length()-1) ==  '.')
            str = str.substring(0,str.length()-1);
        return str;
    }

    private static String addString(String str){
        if(str.length() <= 2){
            String last = String.valueOf(str.charAt(str.length()-1));
            int length = 3-str.length();
            str += last.repeat(length);
        }
        return str;
    }
}