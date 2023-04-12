import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZipArrayMerge {

    public static void main(String[] args) {

        String[] array1 = {"apple", "pear"};
        String[] array2 = {"dog", "cat"};
        String[] array3 = {"apple", "pear", "banana", "orange"};

        System.out.println(Arrays.toString(zipMerge(array1, array2)));
        System.out.println(Arrays.toString(zipMerge(array2, array3)));
        System.out.println(Arrays.toString(zipMerge(array3, array2)));
    }
    private static String[] zipMerge(String[] array1, String[] array2) {

        List<String> shorter;
        List<String> longer;

        if (array1.length <= array2.length) {
            shorter = List.of(array1.clone());
            longer = List.of(array2.clone());
        } else {
            shorter = List.of(array2.clone());
            longer = List.of(array1.clone());
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < shorter.size(); i++) {
            result.add(array1[i]);
            result.add(array2[i]);
        }

        for (int i = shorter.size(); i < longer.size(); i++) {
            result.add(longer.get(i));
        }

        return result.toArray(new String[0]);
    }
}
