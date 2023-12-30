import java.util.Scanner;

public class program28 {
    public static void main(String[] args) {
        int n,num=1,c,d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of row of floyd's a trianle you want");
        n=in.nextInt();
        for(c=1;c<=n;c++){
            for(d=1;d<=c;d++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
