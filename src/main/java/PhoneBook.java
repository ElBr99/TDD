import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

import java.util.Set;

public class PhoneBook {

    private  BidiMap<String, Long> bimap = new TreeBidiMap<>();


    public int add(String name, long number) {
        bimap.put(name, number);
        return bimap.size();
    }

    public String findByNumber(long number) {
        return bimap.getKey(number);
    }

    public Long findByName(String name) {
        return bimap.get(name);
    }

    public void printAllNames() {
        System.out.println(bimap.keySet());
    }

}
