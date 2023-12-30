// import java.util.Scanner;

// public class program8 {
//     public static void main(String[] args) {
//         int x;
//         int y;
//         int z;
//         Scanner in= new Scanner(System.in);
//         x=in.nextInt();
//         y=in.nextInt();
//         z=x+y;
//         System.out.println("Sum of two Integer is "+z);
//     }
// }



// For bigger number

import java.math.BigInteger;
import java.util.Scanner;

public class program8 {

    public static void main(String[] args) {
        String number1;
        String number2;

        Scanner in=new Scanner(System.in);
        number1=in.nextLine();
        number2=in.nextLine();

        BigInteger first= new BigInteger(number1);
        BigInteger second= new BigInteger(number2);
        BigInteger third;
        third=first.add(second);
        System.out.println(third);

    }
}