import java.util.LinkedHashSet;
import java.util.Iterator;


public class program90 {
    public static void main(String[] args) {
        LinkedHashSet<String>al=new LinkedHashSet<String>();
        al.add("Rajindraa");
        al.add("Raja");
        al.add("Ravi");
        al.add("Abodh");
        Iterator<String> itr=al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr);
        }
    }
}
