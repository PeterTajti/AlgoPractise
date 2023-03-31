public class SecondLargestPerimeter {
    public static void main(String[] args) {


            System.out.println(-1 == secondLargestPerimeter(new int[][]{{2, 3, 4}}));
            System.out.println(0 == secondLargestPerimeter(new int[][]{{2, 3, 4}, {4, 5, 6}}));
            System.out.println(1 == secondLargestPerimeter(new int[][]{{4, 5, 6}, {2, 3, 4}}));
            System.out.println(2 == secondLargestPerimeter(new int[][]{{2, 3, 4}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}));
            System.out.println(1 == secondLargestPerimeter(new int[][]{{10, 11, 12}, {7, 8, 9}, {4, 5, 6}, {2, 3, 4}}));
            System.out.println(3 == secondLargestPerimeter(new int[][]{{10, 11, 12}, {2, 3, 4}, {4, 5, 6}, {7, 8, 9}}));
            System.out.println(0 == secondLargestPerimeter(new int[][]{{7, 8, 9}, {4, 5, 6}, {2, 3, 4}, {10, 11, 12}}));
            System.out.println(1 == secondLargestPerimeter(new int[][]{{2, 3, 4}, {7, 8, 9}, {10, 11, 12}, {4, 5, 6}}));
            System.out.println(2 == secondLargestPerimeter(new int[][]{{4, 5, 6}, {10, 11, 12}, {7, 8, 9}, {2, 3, 4}}));

    }
    private static int secondLargestPerimeter(int[][] triangles) {

        if (triangles.length < 2) {
            return -1;
        }

        int largestPerimeter = 0;
        int indexOfLargestPerimeter = 0;
        int secondLargestPerimeter = 0;
        int indexOfSecondLargestPerimeter = 0;

        for (int i = 0; i < triangles.length; i++) {

            int perimeter = 0;

            for (int j = 0; j < triangles[i].length; j++) {
                perimeter += triangles[i][j];
            }

            if (perimeter > largestPerimeter) {
                secondLargestPerimeter = largestPerimeter;
                indexOfSecondLargestPerimeter = indexOfLargestPerimeter;
                largestPerimeter = perimeter;
                indexOfLargestPerimeter = i;
            } else if (perimeter > secondLargestPerimeter) {
                secondLargestPerimeter = perimeter;
                indexOfSecondLargestPerimeter = i;
            }
        }

        return indexOfSecondLargestPerimeter;
    }
}
