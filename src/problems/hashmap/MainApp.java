package problems.hashmap;

public class MainApp {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "ABC");
        myHashMap.put(2, "DEF");
        myHashMap.put(3, "XYZ");
        myHashMap.put(1, "MNO");
        System.out.println(myHashMap.get(3));
        System.out.println(myHashMap.get(1));


        MyHashMap<String, String> myHashMap1 = new MyHashMap<>(5);
        myHashMap1.put("1", "ABC");
        myHashMap1.put("2", "DEF");
        myHashMap1.put("3", "XYZ");
        myHashMap1.put("1", "MNO");
        myHashMap1.put("2", "JKL");
        myHashMap1.put("3", "QWE");
        System.out.println(myHashMap1.get("2"));
        System.out.println(myHashMap1.get("1"));
    }
}
