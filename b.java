import java.util.*;

class a {

    String name;
    int age;

    void display() {

        System.out.println("the name is " + name);

        System.out.println("the age is " + age);
    }

    void display(int age,String s) {

        System.out.println("the name is " + s);

        System.out.println("the age is " + age);
    }

}

public class b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ac = sc.nextInt();
        a ab = new a();
        ab.display();

      String   siam="siam";

        ab.display(ac,siam);

        System.out.println("this is great number" + ac);

        for (int i = 0; i < 13; i++) {

            if ((i % 2 == 0 && i % 3 == 0) || (i % 5 == 0 && i % 6 == 0)) {

                System.out.println("this is an even numberS " + i);
            }

            else {
                System.out.println("this is an odd number " + i);

            }

        }
        System.out.println("this is a great work");
    }
}
