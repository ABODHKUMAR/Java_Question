import java.util.Scanner;

public class program32 {
    public static void main(String[] args) {
        int m,n,c,d;
        System.out.println("Enter the Number of rows and columns");
        Scanner in = new Scanner(System.in);
        m=in.nextInt();
        n=in.nextInt();
        int first[][]=new int[m][n];
        int second[][]=new int[m][n];
        int sum[][]=new int[m][n];
        System.out.println("Enter the element of matrix 1");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                first[c][d]=in.nextInt();
            }
        }
        System.out.println("Enter the element of matrix 2");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                second[c][d]=in.nextInt();
            }
        }
        System.out.println("Enter the element of matrix 1");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                sum[c][d]=first[c][d]+second[c][d];
            }
        }
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                System.out.print(sum[c][d]+" ");
            }
            System.out.println();
        }

    }
}
