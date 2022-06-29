package HashMap;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap m = new HashMap();

        m.put(101, "Narendra");
        m.put(102, "Reetu");
        m.put(103, "Nihkil Jagtap");

        System.out.println(m);

        System.out.println(m.get(102));

        m.remove(103);
        System.out.println(m);
    }
}
