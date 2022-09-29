package Activity;

public class Jaggedarray {
public static void main(String[] args) {
	// Declare 2D Array
	int arr[] []=new int[3][];
	// 5+7+9  = 21
	arr[0]=new int [5];
	arr[1]=new int [7];
	arr[2]=new int [9];
	// Initialized the jaggedarray 
	int count=0;
	for(int i=0; i<arr[i].length; i++)
		for(int j=0; j<arr[i].length; j++)
			arr[i][j] = count++;
			//print the jagedarray
			for(int i=0;i<arr.length;i++) {
				for(int j=0; j<arr.length;j++) {
					System.out.println(arr[i][j]+" ");
				}
						System.out.println();
				}}}
