import java.util.Scanner;

public class program27 {
    public static void main(String[] args) {
        int n;
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
        int sumOfCubeDigit=0;
        int temp=n;
        while(temp>0){
          int t=temp%10;
          temp=temp/10;
          sumOfCubeDigit+=t*t*t;
        }
        if(sumOfCubeDigit==n){
            System.out.println(1);
        }
        System.out.println(0);
    }
}
