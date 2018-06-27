package packageOffByOne;

public class OffByOne {
	
	public int [] createFibonnaciArray(int n) {

		if (n <= 1){
			int[] array = new int [1];
			array[0] = 0;
			return array;
		}else if(n == 2){
			int[] array = new int [2];
			array[0] = 0;
			array[1] = 1;
			return array;
		}
		else {	
			int[] array = new int [n];
			int f1 = 0, f2 = 1, f3 = f1 + f2;
			array[0] = f1;
			array[1] = f2;
			array[2] = f3;

			f2 = f3;
			return array;
		}	
	}
}