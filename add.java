import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int add=sum();
        System.out.println(add);
    }
    public static int sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two num:");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;
    }
}
