package problems.singlenumber;

public class Solution {

    /**
     * It will perfor a XOR like this:
     *
     * Quando você faz XOR de todos esses números juntos:
     * 4 ^ 1 ^ 2 ^ 1 ^ 2
     *
     * Como o XOR de um número com ele mesmo dá 0:
     * 1 ^ 1 = 0
     * 2 ^ 2 = 0
     *
     * Então sobra:
     * 4 ^ 0 ^ 0 = 4
     *
     *  Resposta final: 4 (que é o número que aparece só uma vez).
     *
     * @param numbers
     * @return
     */
    public static int singleNumber(int[] numbers) {
        int singleNumber = 0;
        for (int number : numbers) {
            System.out.println(singleNumber + " ^ " + number);
            singleNumber = singleNumber ^ number;
            System.out.println("singleNumber = " + singleNumber);
        }
        return singleNumber;
    }

    public static void main(String[] args) {
        //int[] numbers = {2, 2, 1};
        int[] numbers = {4,1,2,1,2};
        //int[] numbers = {1};
        int number = singleNumber(numbers);
        System.out.println("Number = " + number);
    }
}
