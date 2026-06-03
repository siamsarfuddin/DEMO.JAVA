
import java.util.*;

public class Near {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("My name is Siam \nMy university is Daffodil\nI am in CSE");

        System.out.println("My name is Siam \nMy university is Daffodil\nI am in CSE");

        int age = in.nextInt();

        System.out.println(age);

        in.nextLine();

        String name = in.nextLine();

        System.out.println(name);
        int[] number = new int[5];


        for (int i = 0; i < 5; i++) {
            number[i] = in.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);
        }

        double siam=in.nextDouble();
        System.out.println(siam);

         System.out.println("you name is"+name);
    }
}
