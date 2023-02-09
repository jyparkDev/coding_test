import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Double> map = new HashMap<>();
        map.put("kg",2.2046);
        map.put("lb",0.4536);
        map.put("l",0.2642);
        map.put("g",3.7854);
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ;i++){
            String[] in = br.readLine().split(" ");
            double a = map.get(in[1])*Double.parseDouble(in[0]);
            String l = in[1].equals("kg") ? "lb" : in[1].equals("lb") ? "kg" : in[1].equals("l") ? "g" : "l";
            System.out.printf("%.4f %s\n",a,l);
        }

    }
}
