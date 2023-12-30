import java.util.Random;

public class program56 {
    public static void main(String[] args) {
        Random t= new Random();
        int c;
        for(c = 1 ; c<=10;c++){
            System.out.println(t.nextInt(100));
        }
    }
}
