package Arrays;

public class removeduplicateelements {
	public static void removeduplicate(int []nums) {
		int uniarr[] = new int[nums.length];
        int idx = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                uniarr[idx++] = nums[i];
            }
        }
        uniarr[idx] = nums[nums.length -1];
        for(int i = 0;i<idx;i++) {
        	nums[i] = uniarr[i];
        }
        for(int i =0;i<nums.length;i++) {
        	System.out.print( nums[i] +  " ");
        }
       // return idx+1;
	}
	public static void main(String[] args) {
		int [] arr = {1,1,2};
		removeduplicate(arr);

	}

}
