package problems.fizzbuzz;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int n = 15;
        List<String> answer = fizBuzz(n);
        System.out.print("[");
        answer.forEach(response -> System.out.print(response + " "));
        System.out.println("]");
    }

    public static List<String> fizBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if(i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(i));
            }
        }
        return answer;
    } // Time complexity: O(n)
      // Space complexity: O(n)
}
