import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2= new ArrayList<String>();
        // ArrayList<Boolean>list3= new ArrayList<Boolean>();
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);

        int element= list.get(0);
        System.out.println(element);


        //add el in between 

        list.add(1,3);
        System.out.println(list);
        list.set(1, 7);
        System.out.println(list);
        

        //delete

        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());

        //loops

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();


        //sorting

        Collections.sort(list);
        System.out.println(list);
    }
}
