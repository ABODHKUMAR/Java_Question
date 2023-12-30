import java.util.HashMap;
import java.util.Map;

public class program93 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "abodh");
        map.put(101, "sachin");
        map.put(102, "ravi");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + "  " + m.getValue());
        }
    }
}
