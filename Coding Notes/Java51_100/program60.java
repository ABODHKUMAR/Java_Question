import java.util.Scanner;

public class program60 {
    public static void main(String[] args) {
       int c,n,search ,array[];
       Scanner in = new Scanner(System.in);

       System.out.println("Enter Number of elements ");
       n=in.nextInt();
       array = new int[n];
       System.out.println("Enter "+n+" integers");

       for(c=0;c<n;c++){
        array[c]=in.nextInt();
       }

       System.out.println("Enter value to be found");

       search=in.nextInt();

       for(c=0;c<n;c++){
         if(array[c]==search){
            System.out.println(search +" is present at location "+(c+1));
            break;
         }
       }

       if(c==n){
         System.out.println(search +"  is not present in array");
       }
    }
}
