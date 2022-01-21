public class p1 {
    public static void main(String args[]) {
        int returned = 0;
        for (int i=0; i<1000; ++i) {
            if (i % 5 == 0 || i % 3 == 0) {
                returned += i;
            }
        }
        System.out.print(returned);
    }
}