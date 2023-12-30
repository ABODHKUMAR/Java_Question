import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        int markObtained;
        int passingmarks;
        passingmarks=40;
        Scanner in = new Scanner(System.in);
        System.out.println("Marks obtained by You");
        markObtained=in.nextInt();
        if(markObtained >= passingmarks){
            System.out.println(" You Passed the Exam");
        } else{
            System.out.println("Unforfuntunatelly you failed to pass the exam");
        }
    }
}
