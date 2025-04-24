package interview.question;

import java.util.*;

public class ItemInCommon {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));
        System.out.println(itemInCommon2(array1, array2));
    }

    // This is O(n^2) - it has nested for loops
    public static boolean itemInCommon(int[] array1, int[] array2) {
        for (int i : array1){
            for (int j : array2) {
                if (i == j) return true;
            }
        }
        return false;
    }

    // With hashtable:
    // O(n) - goes in each loop separatedly
    public static boolean itemInCommon2(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashTable = new HashMap<>();
        for (int i : array1) {
            myHashTable.put(i, true);
        }
        for (int i : array2) {
            if (myHashTable.get(i) != null) return true;
        }
        return false;
    }
}
