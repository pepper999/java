import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {69, 10, 30, 2, 16, 8, 31, 22};

        //삽입정렬 구현 : 배열을 이용해서 구현 해보자 입니다.
        for (int i = 1; i < data.length; i++) {
            int key = data[i]; //이번에 정렬할 값.
            int j;
            for (j = i - 1; j >= 0 && key < data[j]; j--) {
                data[j+1] = data[j];
            }//넣을 위치를 찾고 뒤로 미는 작업까지 동시에 진행하겠다.
            data[j+1] = key;
        }//사이클 돌리기

    }
}
