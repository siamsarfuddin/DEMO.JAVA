
import java.util.Scanner;

class demo{
    
public static void main(String[] args){

Scanner input=new Scanner(System.in);

String max=input.nextLine();

System.out.println("Wellcome:" + max);

int sum=0;

for(int i=0;i<5;i++){
    sum += i;
}

System.out.println("the sum is:"+sum);

}

}