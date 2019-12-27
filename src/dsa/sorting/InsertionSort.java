package dsa.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1, 23,12,99,43,22,65,34};
		a = sort(a);
		for(int i : a)
			System.out.println(i);
	}

	static int[] sort(int[] a) {
		
		for(int i=0; i < a.length; i++) {
			int key = a[i];
			int j = i-1;
			
			/*while(j >= 0 && a[j] > key) {
				a[j+1] = a[j];
				j--;
			}*/
			for(; j>=0 && a[j] > key; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = key;
		}
		return a;
	}
}
