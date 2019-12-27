package dsa.sorting;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] a = new int[] {10,2,23,15,0,6,18,0};
		sort(a,0,a.length-1);
		for(int i : a) {
			System.out.println(i);
		}
	}

	static void sort(int[] a, int lb, int ub) {
		if(lb < ub) {
			int loc = partition(a, lb, ub);
			
			sort(a, lb, loc-1);
			sort(a, loc+1, ub);
		}
	}
	
	static int partition(int[] a, int lb, int ub) {

		int pi = a[lb];
		int start = lb;
		int end = ub;

		while (start < end) {
			while (a[start] <= pi) {
				start++;
			}
			while (a[end] > pi) {
				end--;
			}
			if (start < end) {
				int tmp = a[start];
				a[start] = a[end];
				a[end] = tmp;
			}
		}
		int tmp = a[lb];
		a[lb] = a[end];
		a[end] = tmp;
		
		return end;
	}
}
