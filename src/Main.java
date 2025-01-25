import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Задание 1.
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Я");
        arrayList.add("Учу");
        arrayList.add("Java");
        arrayList.add("Это");
        arrayList.add("Интересно");
        arrayList.add("Но");
        arrayList.add("Сложновато");
        arrayList.add("Но");
        arrayList.add("Я");
        arrayList.add("Смогу");
        arrayList.add("Дорогу");
        arrayList.add("Осилит");
        arrayList.add("Идущий");
        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.println(hashSet);
        System.out.println(Duplicates.countWords(arrayList));

        //Задание 2.
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов","375291234567");
        phoneBook.add("Иванов","711112312334");
        phoneBook.add("Гутов","1231231231233");
        phoneBook.add("Жгутов","76324234234");
        phoneBook.add("Иванов","3752567");
        System.out.println("Номера телефонов Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Номера телефонов Гутов: " + phoneBook.get("Гутов"));
        System.out.println("Номера телефонов Сидорова: " + phoneBook.get("Сидоров")); // Не существует
    }

}