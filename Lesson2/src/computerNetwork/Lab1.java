package computerNetwork;
import static java.lang.Math.pow;
public class Lab1 {

    public static void main(String[] args) {
        double N = 21;
        double p = 0;
        double per = 0;
        double comb;
        while (true) {
            per = 0;
            for (int i = 1; i <= N - 20; i++) {
                p = 20 + i;
                comb = factorial(N) / (factorial(N - p) * factorial(p));
                per += comb * pow(0.2, p) * pow(0.8, (N - p));
            }
            System.out.println(" 가입자수는 " + N + " 퍼센트는 : " + per);
            if (per > 0.01)
                break;
            else {

                N += 1;
            }
        }
    }
    public static double factorial(double n) {

        if (n <= 1) {

            return 1;

        } else {
            return n * factorial(n - 1);
        }
    }
}
