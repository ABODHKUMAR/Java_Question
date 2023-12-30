import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        int n,reverse=0;
        System.out.println("Enter The Number to Reverse");
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
        while(n!=0){
            reverse=reverse*10;
            reverse=reverse+n%10;
            n=n/10;
        }
        System.out.println("Reverse Of Entered number is "+reverse);

    }
}
