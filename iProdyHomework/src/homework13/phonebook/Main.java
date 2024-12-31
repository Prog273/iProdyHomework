package homework13.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //убрал точку вхождения из класса PhoneBook
    public static void main(String[] args) {
        Record record = new Record("Vasya", 3);
        Record record2 = new Record("Kolya", 34);
        Record record3 = new Record("Kolya", 36);
        Record record4 = new Record("впр", 336);
        List<Record> records1 = new ArrayList<>();
        records1.add(record);
        records1.add(record2);
        records1.add(record3);
        records1.add(record4);
        PhoneBook phoneBook = new PhoneBook(records1);
        Record r = phoneBook.find("Kolya");
        System.out.println(r);
        List<Record> rec = phoneBook.findAll("Kolya");
        System.out.println(rec);
    }
}
