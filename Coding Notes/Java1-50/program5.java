import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        float temperature;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter temperatuer in faharaneight");
        temperature=in.nextFloat();
        temperature=((temperature-32)*5)/9;
        System.out.println("Temperatuer in celcius = "+temperature);
    }
}
