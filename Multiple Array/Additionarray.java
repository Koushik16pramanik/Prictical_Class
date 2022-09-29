package Activity;

	public class Additionarray {
		public static void main(String[] args) {
		// Create matrix
		int a [] [] = {{1,2,3},{3,1,5}};
		int b[] [] = {{1,2,2},{3,1,5}};
		// for storing result creating another matrix
		int c [] [] = new int [2][3];
		// logic and printing
		for( int i=0; i<2; i++) {
		for( int j=0; j<3; j++) {
			c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}}}