import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        String s1,s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the The first String");
        s1=in.nextLine();
        System.out.println("Enter the Second String");
        s2=in.nextLine();


        if(s1.compareTo(s2)>0){
            System.out.println("First string is greater than the second");
        } else if (s1==s2){
            System.out.println("Both String are Equal");
        } else{
            System.out.println("String s2 is greater");
        }

    }
}
