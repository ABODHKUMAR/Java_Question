import java.text.SimpleDateFormat;
import java.util.*;
public class program55 {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println("Date format changes by technolarmror");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println(strDate);
    }
}
