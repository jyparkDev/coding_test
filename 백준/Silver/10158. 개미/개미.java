import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		int W = Integer.parseInt(temp.split(" ")[0]);
		int H = Integer.parseInt(temp.split(" ")[1]);
		temp = br.readLine();
		int P = Integer.parseInt(temp.split(" ")[0]);
		int Q = Integer.parseInt(temp.split(" ")[1]);
		int T = Integer.parseInt(br.readLine());

        int currentX = (T + P) % (2 * W);
        int currentY = (T + Q) % (2 * H);
        if(currentX > W) currentX = 2 * W - currentX;
        if (currentY > H) currentY = 2 * H - currentY;

        System.out.println(currentX + " " + currentY);

    }
}