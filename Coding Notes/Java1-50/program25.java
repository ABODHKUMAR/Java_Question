// import java.util.Scanner;

// public class program25 {
//     public static void main(String[] args) {
//         int n,c;
//         System.out.println("Enter the Number to Multiply it's multiplication");
//         Scanner in = new Scanner(System.in);
//         n=in.nextInt();
//         System.out.println("Multiplication of n is "+n+ "is :-");
//         for(c=1;c<=10;c++){
//             System.out.println(n*c);
//         }
//     }
// }

import java.util.Scanner;

/**
 * program25
 */
public class program25 {

    public static void main(String[] args) {
        int a,b,c,d;
        System.out.println("Enter the ranges of number to print their Multiplication");
        Scanner in= new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        for(c=a;c<=b;c++){
            System.out.println("MUltiplication of "+c+ " is" );
            for(d=1;d<=10;d++){
                System.out.println(c+"*"+d+" = "+(c*d));
            }
        }
    }
}