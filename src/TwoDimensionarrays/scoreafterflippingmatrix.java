package TwoDimensionarrays;

public class scoreafterflippingmatrix {
	public static void main(String[] args) {
		int [][] m = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
		int r= m.length;
		int c = m[0].length;
		for(int i = 0;i<r;i++) {
			if(m[i][0] == 0) {
				for(int j = 0;j<c;j++) {
					if(m[i][j] ==0) 
						m[i][j] = 1;
					else 
						m[i][j] = 0;
				}
			}
				
			
		}
		
	}
}
