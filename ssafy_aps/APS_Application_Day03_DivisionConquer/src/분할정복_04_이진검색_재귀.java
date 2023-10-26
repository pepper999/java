import java.util.Arrays;

public class 분할정복_04_이진검색_재귀 {
	public static int[] arr;
	public static int key;
	public static boolean ans;

	public static void main(String[] args) {
		// 테케 안에서 직접 new 혹은 입력을 받아서 써라
		arr = new int[] { 2, 4, 7, 9, 11, 19, 23 };
		key = 8;
		ans = false;
		binarySearch2(0, arr.length - 1);
		System.out.println(ans);

	}
	public static boolean binarySearch(int st, int ed) {
		// 범위안에 들어왔다면 해
		// 범위안에 들어오지 않았다면 쳐내 (이것으로 결정)
		if (st > ed)
			return false;

		int mid = (st + ed) / 2;
		if (arr[mid] == key) return true;
		else if (arr[mid] > key)
			return binarySearch(st, mid - 1);// 왼쪽구간으로
		else
			return binarySearch(mid + 1, ed);// 오른쪽 구간으로

	}
	
	
	
	public static void binarySearch2(int st, int ed) {
		// 범위안에 들어왔다면 해
		// 범위안에 들어오지 않았다면 쳐내 (이것으로 결정)
		if (st > ed)
			return;

		int mid = (st + ed) / 2;
		if (arr[mid] == key) {
			ans = true;
			return;
		} else if (arr[mid] > key)
			binarySearch2(st, mid - 1);// 왼쪽구간으로
		else
			binarySearch2(mid + 1, ed);// 오른쪽 구간으로

	}
}
