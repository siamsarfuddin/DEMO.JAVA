class Student {
    String name;
    int age;

    public void printInfo() {

        System.out.println(this.name);
        System.out.println(this.age);

    }

}

public class k {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "siam sarfuddin";
        s1.age = 22;
        s1.printInfo();
        Student s2 = new Student();
        s2.name = "another student";
        s2.age = 23;
        s2.printInfo();
    }

}