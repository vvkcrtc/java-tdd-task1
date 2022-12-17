import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class PhoneBook {
    public static Map<String, String> phoneBook = new HashMap<String, String>();

    public int add(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, phoneNumber);
        }
        return phoneBook.size();
    }

    public String findByNumber(String number) {
        return phoneBook.keySet()
                .stream()
                .filter(key -> number.equals(phoneBook.get(key)))
                .findFirst().get();
    }
    public String findByName(String name) {
        return null;
    }

}
