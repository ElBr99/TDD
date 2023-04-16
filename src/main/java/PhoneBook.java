import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class PhoneBook {

    BidiMap<String, Long> bimap = new TreeBidiMap<>();


    public int add(String name, long number) {
        bimap.put(name, number);
        return bimap.size();
    }

    public String findByNumber(long number) {
       return bimap.getKey(number);
    }

}
