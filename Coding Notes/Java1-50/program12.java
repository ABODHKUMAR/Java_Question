import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        int markObtained,passingmarks;
        char grade;
        passingmarks=40;
        System.out.println("Input marks scored by you");
        Scanner input=new Scanner(System.in);
        markObtained=input.nextInt();
        if(markObtained>= passingmarks){
            if(markObtained>=90){
                grade='A';
            } else if (markObtained >= 75){
                grade='B';
            } else if (markObtained >=65){
                grade='c';
            }else{
                grade='D';
            }
            System.out.println("You are Passed the exam and your grade is " + grade);
        }else{
            grade='F';
            System.out.println("You are Failed and your grade is "+grade);
        }

    }
}
