class calculator {

    public int add(int n1, int n2) {

        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {

        return n1 + n2 + n3;
    }

    public double add(int n1, double n2) {

        return n1 + n2;
    }

}

public class t {
    public static void main(String[] args) {
        calculator obj = new calculator();

        int r1 = obj.add(3, 4);
        int r2 = obj.add(3, 4, 5);
        double r3 = obj.add(3, 5.44);

        System.out.print("the sum1=" + r1 + "   the sum2= " + r2 + "  the sum3=  " + r3);

    }
}
