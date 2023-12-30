import java.util.Map;
import java.util.TreeMap;

public class program95 {
    public static void main(String[] args) {
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(102, "Ravi");
        hm.put(103, "vijay");

        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + "  " + m.getValue());
        }
    }
}
