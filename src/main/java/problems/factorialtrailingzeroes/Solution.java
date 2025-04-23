package problems.factorialtrailingzeroes;

public class Solution {

    public static int factorialTrailingZeroes(int n){
        int totalZeros = 0;
        int factorial = n;
        for (int i = 1; i < n; i++){
            factorial*=i;
            if (factorial % 10 == 0) {
                totalZeros = 1;
            }
        }
        return totalZeros;
    }
    public static void main(String[] args) {
        int n = 0;
        int results = factorialTrailingZeroes(n);
        System.out.println(results);
    }
}
