public class StairCombinations {
    public static void main(String[] args) {

        int[] steps = {1, 2};
        System.out.println(stairCombinations(1, steps));
    }

    private static int stairCombinations(int stairsSize, int[] steps) {

        if (stairsSize == 0) {
            return 1;
        }

        if (stairsSize < 0) {
            return 0;
        }

        int combos = 0;

        for (int i = 0; i < steps.length; i++) {
            combos += stairCombinations(stairsSize - steps[i], steps);
        }
        return combos;
    }
}
