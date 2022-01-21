import java.lang.String;
public class p4{
    public static void main(String[] args) {
        int largestval = 0;
        for (int a = 100; a < 1000; a++) {
            for (int b = 100; b < 1000; b++) {
                int val = a * b;
                if (val > largestval) {
                    String val_string = String.valueOf(val);
                    int len = val_string.length();
                    boolean works = true;
                    for (int r=0; r<3; r++) {
                        if (val_string.charAt(r) != val_string.charAt(len - r - 1)) {
                            works = false;
                        }
                    }
                    if (works) {
                        largestval = val;
                    }
                }
            }
        }
        System.out.println(largestval);
    }
}
