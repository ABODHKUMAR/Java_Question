import java.util.*;

public class program87 {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("ravi");
        al.add("sachin");
        al.add("mohan");
        al.add("pramod");

        Iterator<String>itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
