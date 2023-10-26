package default_package;

public class Array07_2차원배열_선언 {
    public static void main(String[] args) {
        int[][] arr1; // 이 방법을 권장
        int[] arr2[];
        int arr3[][];

        // 생성하는 방법
        int[][] arr4 = new int[5][5]; // 길이를 넣음

        int[][] arr5 = new int[5][]; // 행의 길이만 넣음
        System.out.println(arr5[0]); // 1차원배열 자리에 null이 들어감
    }
}
