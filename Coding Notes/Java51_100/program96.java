import java.util.Hashtable;
import java.util.Map;

public class program96 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm= new Hashtable<Integer,String>();
        hm.put(100, "Rajindra");
        hm.put(102, "sachin");
        hm.put(103, "ravi");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+"  "+m.getValue());
        }
    }
}
