package homework13;

public class WordCount {
    private String name;
    private int occurance;

    public WordCount(String name, int occurance) {
        this.name = name;
        this.occurance = occurance;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", occurance=" + occurance + '}';
    }
}