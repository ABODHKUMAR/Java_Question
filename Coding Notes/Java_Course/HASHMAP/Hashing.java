import java.util.*;
public class Hashing{
    public static void main(String[] args) {
        
        HashMap<String,Integer> map= new HashMap<String, Integer>();
        map.put("India", 120);
        map.put("USA", 30);
        map.put("china",150);
        System.out.println(map);


        map.put("china", 180);
        System.out.println(map);


        //search operation

        if(map.containsKey("china")){
            System.out.println("present in map");
        }else{
            System.out.println("Not present in the map");
        }


        System.out.println(map.get("china"));
        System.out.println(map.get("ravi"));

        int arr[]={12,13,14};
        for(int i=0;i<3;i++){
            System.out.println(arr[i]+" ");
        }
        for(int val : arr){
            System.out.println(val);
        }

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys= map.keySet();
        for(String key : keys){
            System.out.println(key +"  "+map.get(key));
        }

        map.remove("china");
         for(String key : keys){
            System.out.println(key +"  "+map.get(key));
        }
    }
}