import java.util.*;

public class h {
    public static void PrintMyName(String name) {

        System.out.println(name);
        return;
    }

    public static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        PrintMyName("Siam Sarfuddin");

        System.out.println("this is good");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int sum = Sum(a, b);
        System.out.println(sum);
    }
}
