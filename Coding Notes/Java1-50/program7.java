import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int x;
        int y;
        x=in.nextInt();
        y=in.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Vlaues of x and y is"+x+y);

    }
}
