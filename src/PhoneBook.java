import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> contacts = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        contacts.putIfAbsent(surname, new ArrayList<>());
        contacts.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return contacts.getOrDefault(surname, new ArrayList<>());
    }
}