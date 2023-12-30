// import java.util.Scanner;

// public class program14 {
//     public static void main(String[] args) {
//         int n,c,fact=1;
//         Scanner in=new Scanner(System.in);
//         n=in.nextInt();
//        if(n<0){
//         System.out.println("Number Should be non negative");
//        }else{
//          for(c=1;c<=n;c++){
//             fact=fact*c;
//          }
//        }
//        System.out.println(fact);
//     }
// }

// CalCulate Factorial for large no;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * program14
 */
public class program14 {

    public static void main(String[] args) {
        int n,c;
        BigInteger inc= new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT An interger");
        n=input.nextInt();
        for(c=1;c<=n;c++){
            fact=fact.multiply(inc);
            inc=inc.add(BigInteger.ONE);
        }

        System.out.println(n + "! = " + fact);
    }
}
