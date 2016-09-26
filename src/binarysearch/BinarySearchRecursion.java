package binarysearch;

public class BinarySearchRecursion {
	public static void main(String[] args) {
		int[] a = { 5, 13, 17, 27, 36, 41, 46, 50, 75, 88, 92 };
		int dest = 27;
		int result = find(a, 0, a.length - 1, dest);
		System.out.println(result);
	}

	// 查找分析 :从折半查找过程看，以表的中间元素为比较对象，并以中间元素将表分割
	// 为两个子表，对定位到的子表继续这种操作。所以，对表中每个数据元素的查找过程，可用
	// 二叉树来描述，称这个描述查找过程的二叉树为判定树。
	public static int find(int[] a, int start, int end, int dest) {
		System.out.println(start + " " + end);
		int mid = (start + end) / 2;
		if (a[mid] == dest)
			return mid;
		else if (a[mid] > dest)
			return find(a, start, mid - 1, dest);
		else
			return find(a, mid + 1, end, dest);
	}
}