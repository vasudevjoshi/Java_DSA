package strings;

public class checkifthetwostringsaresameaftersomereversal {
	public static void rotate(char []arr,int i,int j){
        int l = i; int r = j;
        while(l<=r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static String toString(char[] a)
    {
        // Creating object of String class
        StringBuilder sb = new StringBuilder();
 
        // Creating a string using append() method
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
 
        return sb.toString();
    }
	public static void main(String[] args) {
		String s = "abcde";
		String t= "cdeab";
		int len = s.length();
	       int k = len -1;
	       int i = 0;
	       while(k>0){
	            char [] arr = s.toCharArray();
	            rotate(arr,i,k-1);
	            rotate(arr,k,len -1);
	            rotate(arr,i,len -1);
	           String sb = toString(arr);
	            System.out.println(sb + " " + k);
	            k--;
	       } 
	}
}
