import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++){
            String str = br.readLine();
            sb.append(i + ". ");
            sb.append(str);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
