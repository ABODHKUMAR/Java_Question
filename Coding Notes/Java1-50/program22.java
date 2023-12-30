import java.util.Scanner;

public class program22 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input a Interger");
            n=input.nextInt();
            if(n!=0){
                System.out.println("You entered "+n);
            }else{
                break;
            }
        }
    }
}
