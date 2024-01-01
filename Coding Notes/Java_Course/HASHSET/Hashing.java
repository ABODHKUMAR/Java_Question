import java.util.HashSet;
import java.util.Iterator;
public class Hashing{
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(1);

        //search
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(set.contains(3)){
            System.out.println(" contain 3");
        }else{
            System.out.println("Not conatins 3");
        }


        set.remove(1);
         if(set.contains(1)){
            System.out.println(" contain 1");
        }else{
            System.out.println("Not conatins 1");
        }
        System.out.println("size of set is  "+set.size());

        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}