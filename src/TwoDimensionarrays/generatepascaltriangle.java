package TwoDimensionarrays;
import java.util.*;
public class generatepascaltriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines to printed: ");
		int n = sc.nextInt();
		List<List<Integer>> ans = new ArrayList<>();
//		for(int i = 0;i<n;i++) {
//			List<Integer> x = new ArrayList<>();
//			for(int j = 0;j<=i;j++) {
//				if(j == 0 || j == i) {
//					x.add(1);
//				}
//				else {
//					x.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
//				}
//			}
//			ans.add(x);
//		}
//		for(int i = 0;i<n;i++) {
//			for(int j = 0;j<=i;j++) {
//			System.out.print(ans.get(i).get(j)+ " ");
//			}
//			System.out.println();
//		}
		// One more method:
		for(int i = 0;i<n;i++) {
			List<Integer> x= new ArrayList<>();
			for(int j = 0;j<=i;j++) {
					x.add(1);
			}
			ans.add(x);
		}
		for(int i = 2;i<n;i++) {
			for(int j = 1;j<=i-1;j++) {
				ans.get(i).set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
			}
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<=i;j++) {
			System.out.print(ans.get(i).get(j)+ " ");
			}
			System.out.println();
		}
	}
}
