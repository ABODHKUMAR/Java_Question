import java.net.Inet4Address;
import java.net.InetAddress;

public class program58 {

    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localHost);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}