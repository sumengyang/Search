package binarysearch;

public class BinarySearchRecursion {
	public static void main(String[] args) {
		int[] a = { 5, 13, 17, 27, 36, 41, 46, 50, 75, 88, 92 };
		int dest = 27;
		int result = find(a, 0, a.length - 1, dest);
		System.out.println(result);
	}

	// ���ҷ��� :���۰���ҹ��̿����Ա���м�Ԫ��Ϊ�Ƚ϶��󣬲����м�Ԫ�ؽ���ָ�
	// Ϊ�����ӱ��Զ�λ�����ӱ�������ֲ��������ԣ��Ա���ÿ������Ԫ�صĲ��ҹ��̣�����
	// ��������������������������ҹ��̵Ķ�����Ϊ�ж�����
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