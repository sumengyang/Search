package sequencesearch;

public class SequenceSearch {
	public static void main(String[] args) {
		int[] a = {5 , 13 , 17 , 27 , 36 , 41 , 46 , 50 , 75 , 88 , 92};
		int dest = 27;
		int result = find(a, dest);
		System.out.println(result);
	}
	
	public static int find(int[] a, int dest){
		int i = 0;
		for(; i < a.length; i++)
			if(a[i] == dest)
				break;
		if(i < a.length)
			return i;
		return -1;
	}
}
