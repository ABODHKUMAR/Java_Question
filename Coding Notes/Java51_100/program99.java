
public class program99 {
    static int Factorial(int n){
        //Base Case
        if(n == 1){
            return 1;
        }else{
            return (n*Factorial(n-1));
        }



        //Recusive case



    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is :  "+Factorial(5));
    }
}
