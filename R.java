class config {

    public void show() {

        System.out.println("is show");

    }

    public void show1() {
        System.out.println("is showing");
    }

}

class a extends config {
     public void show(){

        System.out.println("this is great exmple of methos over riding which initilaized my extends method");
     }
}

public class R {

    public static void main(String[] args) {

        a obj = new a();

        obj.show();
        obj.show1();

    }
}
