import java.util.Scanner;

public class program49 {
    public static void main(String[] args) {
        int a,b,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        a=input.nextInt();
        b=input.nextInt();
        try{
            result=a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught : Division by zero");
        }
    }
}
