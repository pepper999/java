import java.util.Arrays;

public class Array2_01_SequentailSearch {
    public static int[] arr = { 4, 9, 11, 23, 2, 19, 7 };

    public static void main(String[] args) {
        System.out.println(searchForNoSort(2));
        System.out.println(searchWhileNoSort(2));
        System.out.println(searchWhileNoSort2(2));

        Arrays.sort(arr);
        System.out.println(searchForSort(12));
        System.out.println(searchWhileSort(12));
    }

    // 인덱스를 반환할 수도 있고 찾았다 못찾았다의 boolean을 반환할 수도 있고
    public static boolean searchForNoSort(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static boolean searchWhileNoSort(int key) {
        int idx = 0;
        while (idx < arr.length) {
            if (arr[idx] == key) {
                return true;
            }
            idx++;
        }
        return false;
    }

    public static boolean searchWhileNoSort2(int key) {
        int idx = 0;
        while (idx < arr.length && arr[idx] != key) {
            idx++;
        }
        if (idx < arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public static int searchForSort(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key < arr[i]) {
                return arr.length - i;
            }
        }
        return 0;
    }

    public static int searchWhileSort(int key) {
        int idx = 0;
        while (arr[idx] <= key) {
            idx++;
        }
        return arr.length - idx;
    }
}
