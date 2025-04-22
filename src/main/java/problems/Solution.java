package problems;

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
     * Finds two indices in the numbers such that the numbers at those indices add up to the target.
     *
     * @param numbers the input numbers of integers
     * @param target the target sum to find in the numbers
     * @return an numbers of two integers representing the indices of the two numbers
     *         that add up to the target, or null if no such pair exists
     */
    public static int[] solution(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) return null;
        for (int pointer1 = 0; pointer1 < numbers.length; pointer1++) {
            int numberToFind = target - numbers[pointer1];
            for (int pointer2 = pointer1 + 1; pointer2 < numbers.length; pointer2++) {
                if (numbers[pointer2] == numberToFind) {
                    return new int[]{pointer1, pointer2};
                }
            }
        }
        return null;
    }
}
