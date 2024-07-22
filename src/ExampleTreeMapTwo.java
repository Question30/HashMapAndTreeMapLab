import java.util.TreeMap;

public class ExampleTreeMapTwo {
    public static void main(String[] args) {
        TreeMap<String, Integer> numebrs = new TreeMap<>();
        numebrs.put("First", 1);
        numebrs.put("Second", 2);
        numebrs.put("Third", 3);
        System.out.println("TreeMap: " + numebrs);

        String firstKey = numebrs.firstKey();
        System.out.println("First Key: " + firstKey);

        String lastKey = numebrs.lastKey();
        System.out.println("Last Key: " + lastKey);

        System.out.println("First Entry: " + numebrs.firstEntry());

        System.out.println("Last Entry: " + numebrs.lastEntry());
    }
}
