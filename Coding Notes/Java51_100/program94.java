import java.util.LinkedHashMap;
import java.util.Map;

public class program94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm= new LinkedHashMap<Integer,String>();
        hm.put(100, "Abodh");
        hm.put(101,"vijay");
        hm.put(102,"ravi");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+"    "+m.getValue());
        }
    }
}
