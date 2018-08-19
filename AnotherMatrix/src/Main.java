
public class Main {
	public static int pCount = 0;
	public static int repCount = 0;
	public static int[][] array = {
		{0, 0, 	0, 	0, 	0 ,	0},
		{0, 1, 	2, 	3, 	4, 	0},
		{0, 5, 	6, 	7, 	8, 	0},
		{0, 9, 	10, 11, 12, 0},
		{0, 13, 14, 15, 16, 0},
		{0, 0, 	0, 	0, 	0 ,	0}};
	
	public static final Object monitor = new Object();
	
	public static void printArray() {
		for (int i = 1; i < array.length - 1; ++i) {
			for (int j = 1; j < array[i].length - 1; ++j)
				System.out.print(array[i][j] + "\t");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printArray();
		for (int i = 1; i < array.length - 1; ++i)
			(new CalcThread(i, 2)).start();	
	}
}
