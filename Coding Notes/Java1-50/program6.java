import java.util.Scanner;

public class program6 {
  public static void main(String[] args) {
    int x,y,temp;
    System.out.println("Enter x and y");
    Scanner in = new Scanner(System.in);
    x=in.nextInt();
    y=in.nextInt();
    System.out.println("Before swap");
    System.out.println(x+"\n"+y);
    temp=x;
    x=y;
    y=temp;
    System.out.println("After swap");
    System.out.println(x+"\n"+y);
  }  
  
}
