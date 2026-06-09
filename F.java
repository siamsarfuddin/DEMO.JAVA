import java.util.*;

public class F {
    public static void main(String[] args) {

        int fac = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            fac = fac * i;

        }
        System.out.print("the factorian of " + n + "is " + fac);

    }
}