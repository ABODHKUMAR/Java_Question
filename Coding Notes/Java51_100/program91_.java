import java.util.*;
public class program91_ {
    public static void main(String[] args) {
        TreeSet<String>al= new TreeSet<String>();
        al.add("Abodh");
        al.add("Raja");
        al.add("Ravi");
        al.add("Hello world");

        Iterator<String>itr=al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
