import java.util.PriorityQueue;
import java.util.Iterator;


public class program92 {
    public static void main(String[] args) {
        PriorityQueue<String>queue=new PriorityQueue<String>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("6");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        queue.remove();
             System.out.println(queue.element());
        System.out.println(queue.peek());

     Iterator<String>itr=queue.iterator();
     while (itr.hasNext()) {
        System.out.println(itr.next());
     }

    }
}
