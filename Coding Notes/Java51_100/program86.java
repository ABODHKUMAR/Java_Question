import java.util.ArrayList;
import java.util.Iterator;

public class program86 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abodh");
        list.add("sachin");
        list.add("Raja");
        list.add("Hello world");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
