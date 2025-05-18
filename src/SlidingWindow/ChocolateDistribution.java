package SlidingWindow;
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int res = Integer.MAX_VALUE;
        for(int i = 0;i<arr.size() - m +1;i++){
            int min = arr.get(i);
            int max = arr.get(i+ m - 1);
            res = Math.min(res,max - min);
        }
    return res;        
    }
}