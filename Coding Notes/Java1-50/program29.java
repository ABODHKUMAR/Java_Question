import java.util.Scanner;

public class program29 {
    public static void main(String[] args) {
        String mainString , sub;
        int i,c,length;
        Scanner in = new Scanner(System.in);
        mainString=in.nextLine();
        System.out.println("Your sub string are");
        length=mainString.length();
        for(c=0;c<length;c++){
            for(i=1;i<=length-c;i++){
                sub=mainString.substring(c, c+i);
                System.out.println(sub);
            }
        }
    }
}
