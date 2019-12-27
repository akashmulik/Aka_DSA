package dsa.searching;

public class BinarySearch {

	public static void main(String[] args) {

		int[] x = {1,4,5,8,12,14,22,27,55,51,76,100};
		int res = search(x, 0, x.length-1, 76);
		
		System.out.println(res);
	}

	static int search(int[] a, int l, int r, int x) {
		
		if(l <= r) {
			int mid = l + (r-l) /2;
			
			if(a[mid] == x)
				return mid;
			if(x < a[mid])
				return search(a, l, mid - 1, x);
			return search(a, mid+1, r, x);
		}
		return -1;
	}
}
