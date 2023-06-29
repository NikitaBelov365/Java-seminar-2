public class First {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String c1 = "a";
        String c2 = "b";
        int N = 100;
        for (int i = 0; i < N/2; i++) {
            sb.append(c1 + c2);
        }
        System.out.println(sb);
    }
}