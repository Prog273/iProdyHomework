package homework13.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> records;

    public PhoneBook(List<Record> records) {
        this.records = records;
    }

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        List<Record> records = this.records;
        for (var record : records) {
            if (record.getName().equals(name)) return record;
        }
        return null;
    }

    public List<Record> findAll(String name) {
        //лишнюю строку, которую ты указал, удалил
        List<Record> necessaryRecords = new ArrayList<>();
        for (var record : records) {
            if (record.getName().equals(name)) {
                necessaryRecords.add(record);
            }
        }
        return necessaryRecords;
    }
}
