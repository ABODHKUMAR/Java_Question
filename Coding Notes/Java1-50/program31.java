// import java.util.Scanner;

// public class program31 {
//     public static void main(String[] args) {
//         String original;
//         String reverse="";

//         Scanner in = new Scanner(System.in);
//         original=in.nextLine();
//         int len=original.length();
//         for(int i=len-1;i>=0;i--){
//             reverse=reverse+original.charAt(i);
//         }

//         if(original.equals(reverse)){
//             System.out.println("true");
//         }else{
//             System.out.println(original+" "+reverse);
//             System.out.println("False");
//         }
//        }
// }

import java.util.Scanner;

/**
 * program31
 */
public class program31 {

    public static void main(String[] args) {
        String inpuString;
        Scanner in =new Scanner(System.in);
        System.out.println("Input a String");
        inpuString = in.nextLine();
        int length=inpuString.length();


        int i,begin,end,middle;
        begin=0;
        end=length-1;
        middle=(begin+end)/2;
        for(i=begin;i<=middle;i++){
            if(inpuString.charAt(begin) == inpuString.charAt(end)){
                begin++;
                end--;
            }else{
                break;
            }
        }
        if(i == middle + 1){
            System.out.println("Palindorme");
        }else{
            System.out.println("Not a plaindrome");
        }
    }
}