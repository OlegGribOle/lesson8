import java.util.*;

public class Main {
    public static void main(String[] args) {
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

    }
}