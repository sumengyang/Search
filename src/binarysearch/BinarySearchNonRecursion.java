package binarysearch;

public class BinarySearchNonRecursion {
	public static void main(String[] args) {
		int[] a = { 5, 13, 17, 27, 36, 41, 46, 50, 75, 88, 92 };
		int dest = 27;
		int result = find(a, 0, a.length - 1, dest);
		System.out.println(result);
	}

	public static int find(int[] a, int start, int end, int dest) {
		while (start <= end) {
			System.out.println(start + " " + end);
			int mid = (start + end) / 2;
			if (a[mid] == dest)
				return mid;
			else if (a[mid] > dest)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
}
