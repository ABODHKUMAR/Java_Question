// import java.util.Scanner;

// public class program30 {
//     public static void main(String[] args) {
//         String original , reverse="";
//         Scanner in= new Scanner(System.in);
//         System.out.println("Enter the String to reverse");
//         original=in.nextLine();
//         int length=original.length();
//         for(int i=length-1;i>=0;i--){
//             reverse=reverse+original.charAt(i);
        
//         }
//         System.out.println(reverse);
//     }
// }

/**
 * program30
 */
public class program30 {

    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("Abodh");
        System.out.println(a.reverse());

    }
}