import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Khoi tao 1 doi tuong tu Map Interface và lớp HashMap
        Map<Integer, String> mapStudent = new HashMap<>();
        //boolean isEmpty(): Kiem tra map co phan tu hay khong
        System.out.println("Mang co phan tu hay khong: "+mapStudent.isEmpty());
        // V put(key,value): them mot entry vao trong map
        mapStudent.put(1,"Nguyen Van A");
        mapStudent.put(2,"Nguyen Van C");
        mapStudent.put(3,"Nguyen Van D");
        String str = mapStudent.put(1, "Nguyen Van B");
        System.out.println("Gia tri tra ra cua phuong thuc put: " + str);
        System.out.println("Gia tri cac entry trong mapStudent la: ");
        //void clear(): Xoa cac entry trong map
//        mapStudent.clear();
        //boolean containsKey(K key)
        System.out.println("Kiem tra key = 1 co trong mapStudent: "+mapStudent.containsKey(1));
        //boolean containsValue(V value)
        System.out.println("Kiem tra value = Nguyen Van C co trong mapStudent: "+mapStudent.containsValue("Nguyen Van C"));
        //V get(K key)
        System.out.println("Value cua entry co key = 2 la: "+mapStudent.get(2));
        //Khoi tao map moi
        Map<Integer,String> mapDemo = new HashMap<>();
        mapDemo.put(4,"Nguyen Van E");
        mapDemo.put(5,"Nguyen Van F");
        //void putAll(Map<K,V>)
        mapStudent.putAll(mapDemo);
        //V remove(Key key)
        System.out.println("Gia tri value tra ra khi xoa entry co key = 4: "+mapStudent.remove(4));
        //int size(): So entry trong map
        System.out.println("So entry trong mapStudent la: "+mapStudent.size());
        //In cac gia tri cua mapStudent
        System.out.println(mapStudent.values());
        //Set<K> keySet(): Lay ra set cac key trong map
        for (Integer key : mapStudent.keySet()) {
            System.out.printf("%d - %s\n",key,mapStudent.get(key));
        }
    }
}