import java.io.FileWriter;
import java.io.IOException;

public class Second {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String c1 = "test";
        int N = 100;
        for (int i = 0; i < N / 2; i++) {
            sb.append(c1);
        }
        try (FileWriter notation = new FileWriter("C:/Users/Н/Edu/Java/seminars/2/file.txt", false)) {
            notation.append(sb);
            notation.close();
         } 
        catch (IOException e) {
            System.out.println(e.toString());
        }
        System.out.println(sb);
    }
}
