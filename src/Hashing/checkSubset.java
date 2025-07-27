package Hashing;

import java.util.* ;
import java.io.*; 

public class Solution {
    public static boolean checkSubset(int[] arr1, int[] arr2, int n, int m) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of each element in arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check if each element in arr2 exists in arr1 with enough frequency
        for (int num : arr2) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }
            map.put(num, map.get(num) - 1);
        }

        return true;
    }
}

