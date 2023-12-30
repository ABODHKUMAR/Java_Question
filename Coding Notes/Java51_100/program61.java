import java.util.Scanner;

public class program61 {
    public static void main(String[] args) {
        int c,first,last,middle,n,search,array[];
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        array= new int[n];
        System.out.println("Enter number of element "+n);
        for(c=0;c<n;c++){
            array[c]=in.nextInt();
        }
        System.out.println("Enter elemnt to search");
        search=in.nextInt();
        first=0;
        last=n-1;
        while (first <= last) {
            middle =(first + last)/2;
             if(array[middle]==search){
                System.out.println("found element at index"+middle);
             }
            if(array[middle ] < search){
                first = middle + 1;
            }else{
                last=middle-1;
            }
        }
        if(first >last){
            System.out.println("Entered element not present in arary");
        }
    }
}
