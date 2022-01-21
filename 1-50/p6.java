public class p6 {
    public static void main(String[] args) {
        int d = 100;
        int sum_of_squares = 0;
        int sum = 0;
        for (int i=1; i<=d; i++) {
            sum_of_squares += Math.pow(i,2);
            sum += i;
        }
        double square_of_sum = Math.pow(sum,2);

        System.out.println((int) (square_of_sum-sum_of_squares));
    }
}
