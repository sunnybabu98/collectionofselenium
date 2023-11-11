package ArraysPackage;

public class Multidirectionalarrays {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][10];
		
		arr[0][0]=1;
		arr[1][0]=2;
		arr[1][2]=3;
		arr[1][1]=4;
		arr[0][2]=5;
		arr[0][1]=6;
		
		arr[0][9]=19;
		
		
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j=0; j<10;j++)
			{
				System.out.print(arr[i][j] + "");
			}
			System.out.println();
		}
		

	}

}
