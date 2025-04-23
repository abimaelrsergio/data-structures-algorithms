package problems.palindromenumber;

public class Solution {
    public static boolean palindromeNumber(int x) {
        if (x < 0 || (x % 10 == 0 && x !=0)) return false;
        int reversed = 0;
        while(x > reversed) {
            reversed = reversed * 10 + x % 10;
            x/=10;
        }
        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        boolean response = palindromeNumber(12321);
        System.out.println(response);
    }
}
