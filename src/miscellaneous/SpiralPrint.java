package miscellaneous;

public class SpiralPrint {
	public static void printSpiral(int[][] arr){
		int i, sr=0,er=arr.length,sc=0,ec = arr[0].length;

		while(sr<er && sc<ec){
			for(i=sc;i<ec;i++){
				System.out.print(arr[sr][i]+" ");
			}
			sr++;
			for(i=sr;i<er;i++){
				System.out.print(arr[i][ec-1]+" ");
			}
			ec--;
			if(sr<er){
				for(i=ec-1;i>=sc;i--){
					System.out.print(arr[er-1][i]+" ");
				}
				er--;
			}
			if(sc<ec){
				for(i=er-1;i>=sr;i--){
					System.out.print(arr[i][sc]+" ");
				}
				sc++;
			}
		}
	}
	public static void main(String[] args) {
		int[][] a= { {1,  2,  3,  4,  5,  6},
		           	 {7,  8,  9,  10, 11, 12},
		           	 {13, 14, 15, 16, 17, 18},
		           	 {19, 20, 21, 22, 23, 24},
		           	 {25, 26, 27, 28, 29, 30},
		           	 {31, 32, 33, 34, 35, 36}
		    		};
		printSpiral(a);
	}

}
