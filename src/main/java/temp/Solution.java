package temp;

public class Solution {
    /**
     * Tests the solution method with an array {1,6} and target 7,
     * and prints the result.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,6};
        int target = 7;

        int[] solution = solution(array, target);
        if (solution != null)
            System.out.println(solution[0] + "," + solution[1]);
        else
            System.out.println(solution);
    }

    /**
     * Finds two indices in the array such that the numbers at those indices add up to the target.
     *
     * @param array the input array of integers
     * @param target the target sum to find in the array
     * @return an array of two integers representing the indices of the two numbers
     *         that add up to the target, or null if no such pair exists
     */
    public static int[] solution(int[] array, int target) {
        if (array == null || array.length == 0 || array.length == 1) return null;
        for (int index = 0; index < array.length; index++) {
            int pointer1 = array[index];
            int numberToFind = target - pointer1;
            for (int index2 = index + 1; index2 < array.length; index2++) {
                int pointer2 = array[index2];
                if (pointer2 == numberToFind) {
                    return new int[]{index, index2};
                }
            }
        }
        return null;
    }
}
