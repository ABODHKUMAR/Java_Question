public class program50 {
    static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("not valid ");
        } else{
            System.out.println("welcome to vote on Technolamror");
        }
    }
    public static void main(String[] args) {
        validate(20);
        System.out.println(" Rest of the Code here");
    }
}
