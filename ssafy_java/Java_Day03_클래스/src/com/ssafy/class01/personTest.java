package com.ssafy.class01;

public class personTest {
    public static void main(String[] args) {
        String name1 = "Yang";
        String name2 = "Hong";

        int age1 = 45;
        int age2 = 25;

        String hobby1 = "Youtube";
        String hobby2 = "Golf";

        // 배열로 관리하기
        int size = 2;
        String[] names = new String[size];
        names[0] = "Yang";
        names[1] = "Hong";

        int[] ages = new int[size];
        ages[0] = 45;
        ages[1] = 25;

        String[] hobbies = new String[size];
        hobbies[0] = "Youtube";
        hobbies[1] = "Golf";
    }
}
