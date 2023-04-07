public class AverageOfEveryNth {

    public static void main(String[] args) {

        System.out.println(averageOfEveryNth(new int[]{2, 4, 10, 34, 3, 16, 3, 21}, 3)); // 13
        System.out.println(averageOfEveryNth(new int[]{2, 4, 10, 34, 3, 16, 3, 21}, 2)); // 18.75
        System.out.println(averageOfEveryNth(new int[]{2, 4, 10, 34, 3, 16, 3, 21}, 10)); // 0
    }

    private static double averageOfEveryNth(int[] numbers, int n) {

        if (n > numbers.length) {
            return 0;
        }

        int sum = 0;
        int counter = 0;
        int repeatNum = numbers.length / n;
        int position = n;

        for (int i = 0; i < repeatNum; i++) {

            sum += numbers[position - 1];
            position += n;
            counter++;
        }

        double result = (double) sum / counter;

        return result;
    }

    private static double averageOfEveryNth2(int[] numbers, int n) {

        int q = numbers.length / n;
        double average = 0;

        for (int i = n - 1; i < numbers.length; i += n) {
            average += (double) numbers[i] / q;
        }

        return average;
    }
}
