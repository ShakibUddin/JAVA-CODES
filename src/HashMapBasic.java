import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args)
    {

        HashMap<String, Integer> map
                = new HashMap<>();

        print(map);
        map.put("Naruto", 10);
        map.put("Sasuke", 90);
        map.put("Sakura", 20);

        System.out.println("Size of map is:- "
                + map.size());

        print(map);
        if (map.containsKey("Naruto")) {
            Integer a = map.get("Naruto");
            System.out.println("value for key"
                    + " \"Naruto\" is:- "
                    + a);
        }
        if(map.containsValue(10)){
            System.out.println("Map contains value 10");
            map.remove("Sakura");//removing sakura
            print(map);
        }
        if(map.containsKey("Naruto")){
            System.out.println("Map contains Naruto");
            map.replace("Naruto",10,100);//Replacing Naruto's value 10 with 100
            print(map);
        }
        map.putIfAbsent("Kakashi",80);//Putting Kakashi if it doesn't exist
        print(map);
        map.clear();
        print(map);
    }
    public static void print(HashMap<String, Integer> map)
    {
        if (map.isEmpty()) {
            System.out.println("map is empty");
        }

        else {
            System.out.println(map);
        }
    }
}
