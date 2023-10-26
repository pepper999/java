package default_package;

public class Array01_생성 {
    public static void main(String[] args) {
        // 1차원 배열 선언하는 방법
        int[] score1; // 이 방법을 더 권장
        int score2[];

        // 배열을 생성하는 방법
        // 1. 자료형[] 이름 = new 자료형[길이]; 값은 자료형의 초기값으로 초기화
        int[] score3 = new int[5];

        // 2. 자료형[] 이름 = new 자료형[] {원소1,원소2,..};
        int[] score4 = new int[] { 1, 2, 3, 4 };

        // 3. 자료형[] 이름 = {1,2,3,4}; // 선언과 동시에 초기화
        int[] score5 = { 1, 2, 3, 4 }; // 약간의 제약 사항이 있음

        // score = new int[6]; // 변수 재할당 가능
        // score = new int[] {1,2,3,4,5}; // 변수 재할당 가능
        // score = {1,2,3,4,5}; // 변수 재할당 불가능

        int[] score6 = new int[5];

        score6[0] = 10;
        score6[1] = 20;
        // score6[5] = 60; // 빨간줄은 뜨지 않지만 인덱스가 넘어가므로 실행 불가능
    }
}
