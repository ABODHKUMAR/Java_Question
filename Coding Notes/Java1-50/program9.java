import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;

        Scanner in= new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if ( x > y && x > z ) {
            System.out.println(x+"Biggest");
        }else if ( y > x && y > x){
            System.out.println("Bigest number is "+y);
        }else{
            System.out.println(z+"Z is the biggest Number");
        }
        
    }
}
