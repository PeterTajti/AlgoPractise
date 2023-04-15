package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayDuplicates {

    public static void main(String[] args) {

        String[] str = {"ccooddddddewwwaaaaarrrrsssss", "piccaninny", "hubbubbubboo"};
        System.out.println(Arrays.toString(dup(new String[]{"abracadabra", "allottee", "assessee"})));
        System.out.println(Arrays.toString(dup(new String[]{"kelless", "keenness"})));
        System.out.println(Arrays.toString(dup(str)));
    }

    public static String[] dup(String[] arr) {

        List<String> result = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length() - 1; j++) {
                if (arr[i].charAt(j) != arr[i].charAt(j + 1)) {
                    temp += arr[i].charAt(j);
                }
            }
            temp += arr[i].charAt(arr[i].length() - 1);
            result.add(temp);
            temp = "";
        }

        String[] tempArray = new String[result.size()];
        return result.toArray(tempArray);
    }
}
