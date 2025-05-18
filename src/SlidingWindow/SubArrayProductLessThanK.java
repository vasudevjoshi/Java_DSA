package SlidingWindow;

// leetcode: 713
class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if(k<=1) return 0;
        int s = 0;

        int e = 0;
        int prod = 1;
        int n = arr.length;
        int res = 0;
        while(e<n){
            prod*=arr[e];
                while(prod >= k){
                    prod/=arr[s];
                    s++;
                }
            res =res+(e -s + 1);
            e++;
        }
        return res;
    }
}