import java.util.Scanner;

public class program34 {
    public static void main(String[] args) {
        int m,n,c,d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of row and columns if matrix");
        m=in.nextInt();
        n=in.nextInt();
        int matrix[][]=new int[m][n];

        System.out.println("Enter the elements of matrix");

        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                matrix[c][d]=in.nextInt();
            }
        }
        int transpose[][]=new int[n][m];
        for(c=0;c<n;c++){
            for(d=0;d<m;d++){
                transpose[d][c]=matrix[c][d];
            }
        }
        System.out.println("Transpose of entered matrix is -");
        for(c=0;c<n;c++){
            for(d=0;d<m;d++){
                System.out.print(transpose[c][d]+"\t");
            }
            System.out.println("\n");
        }
    }
}
