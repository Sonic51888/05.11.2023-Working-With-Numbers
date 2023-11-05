import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Comparator.naturalOrder();
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Iterator iterInitList = intList.iterator();
        int i = 0;
        while (iterInitList.hasNext()) {
            i = (int) iterInitList.next();
            if (i < 0 || (i % 2) != 0 || i == 0) {
                iterInitList.remove();
            }
        }
        intList.sort(comparator);
        System.out.println(intList);
    }
}