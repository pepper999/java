import java.util.Arrays;

public class Array2_02_BinarySearch {
    public static int[] arr = { 2, 4, 7, 9, 11, 19, 23 };

    public static void main(String[] args) {
        System.out.println(binarySearch(7));
        System.out.println(binarySearch(20));

        System.out.println(Arrays.binarySearch(arr, 7));
        System.out.println(Arrays.binarySearch(arr, 20)); // 값이 없을 경우 key보다 큰 값의 최초인덱스 * -1 에서 1을 뺸 값을 리턴한다
    }

    // 이진검색 : 자료가 정렬된 상태 일 때만 사용가능 / 검색 범위를 절반 씩 줄여나감
    public static boolean binarySearch(int key) {
        int st = 0;
        int ed = arr.length - 1;

        while (st <= ed) {
            int mid = (st + ed) / 2;
            if (arr[mid] < key) {
                st = mid + 1;
            } else if (arr[mid] > key) {
                ed = mid - 1;
            } else {
                return true;
            }

        }
        return false;
    }
}
