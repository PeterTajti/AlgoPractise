import java.util.ArrayList;
import java.util.List;

public class IrregularListing {
    public static void main(String[] args) {

        System.out.println("Should be TRUE:");
        // O/1
        System.out.println(irregularListing(new int[]{1, 2, 3, 4, 5}, 1)); // true
        System.out.println(irregularListing(new int[]{1}, 5)); // true
        // E/1
        System.out.println(irregularListing(new int[]{1, 2, 3, 4}, 1)); // true
        System.out.println(irregularListing(new int[]{1}, 4)); // true
        // O/O
        System.out.println(irregularListing(new int[]{1, 2, 3, 4, 5}, 3)); // true
        System.out.println(irregularListing(new int[]{1, 2, 3}, 5)); // true
        // O/E
        System.out.println(irregularListing(new int[]{1, 2, 3, 4, 5}, 4)); // true
        System.out.println(irregularListing(new int[]{1, 2, 3, 4}, 5)); // true
        // E/O
        System.out.println(irregularListing(new int[]{1, 2, 3, 4}, 3)); // true
        System.out.println(irregularListing(new int[]{1, 2, 3}, 4)); // true

        System.out.println("Should be FALSE:");
        // O/O
        System.out.println(irregularListing(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3)); // false
        System.out.println(irregularListing(new int[]{1, 2, 3}, 9)); // false
        // O/E
        System.out.println(irregularListing(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 6)); // false
        System.out.println(irregularListing(new int[]{1, 2, 3, 4, 5, 6}, 9)); // false
        // E/O
        System.out.println(irregularListing(new int[]{1, 2, 3, 4, 5, 6}, 3)); // false
        System.out.println(irregularListing(new int[]{1, 2, 3}, 6)); // false
        // E/E
        System.out.println(irregularListing(new int[]{1, 2, 3, 4, 5, 6}, 4)); // false
        System.out.println(irregularListing(new int[]{1, 2, 3, 4}, 6)); // false
    }
    public static boolean irregularListing(int[] arr, int n) {

        List<Integer> touchedIndexes = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            while (index > arr.length - 1) {
                index = index - arr.length;
            }

            touchedIndexes.add(index);

            index = index + n;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!touchedIndexes.contains(i)) {
                return false;
            }
        }

        return true;
    }
}
