public class p5 {
    public static void main(String[] args) {
        int currentnum = 1;
        for (int i=1; i<=21; i++) {
            for (int j=1; j<=i; j++) {
                if ((currentnum * j) % i == 0) {
                    currentnum = currentnum * j;
                    break;
                }
            }
        }
        System.out.println(currentnum);
    }
}
