import java.util.Scanner;

public class program21 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input a Interger");
            n=input.nextInt();
            if(n==0){
                break;
            }
            System.out.println("You have entered"+n);
        }
        
    }
}
