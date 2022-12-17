import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static final Map<String, String> phoneBook = new HashMap<String, String>();
    public int add(String name, String phoneNumber) {
        if(!phoneBook.containsKey(name)) {
            phoneBook.put(name,phoneNumber);
        }
        return phoneBook.size();
    }

}
