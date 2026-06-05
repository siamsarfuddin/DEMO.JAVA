 class Overload {
    void add(double a, double b) {

        System.out.println(a + b);
    }

    void add(int a, int b, int c) {

        System.out.println(a + b + c);
    }

    void add() {

        System.out.println("no nothing to add");

    }
}

public class L {

    public static void main(String[] args) {

        Overload b = new Overload();
        b.add();
        b.add(6.5, 5.5);
        b.add(1, 2, 3);

    }
}
