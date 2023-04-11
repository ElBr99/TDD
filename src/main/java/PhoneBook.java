import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, Long> map = new HashMap<>();

    public int add(String name, long number) {
        map.put(name, number);
        return map.size();
    }

}
