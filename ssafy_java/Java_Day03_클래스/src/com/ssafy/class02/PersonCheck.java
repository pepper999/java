package com.ssafy.class02;

public class PersonCheck {
    public static void main(String[] args) {
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

//		System.out.println("나의 이름은 "+names[0] + "입니다.");
//		System.out.println("나이는 "+ages[0]+"세, 취미는 "+hobbies[0]+"입니다.");
//		System.out.println("나의 이름은 "+names[1] + "입니다.");
//		System.out.println("나이는 "+ages[1]+"세, 취미는 "+hobbies[1]+"입니다.");
//	
//		for(int i = 0 ; i<size; i++) {
//			System.out.println("나의 이름은 "+names[i] + "입니다.");
//			System.out.println("나이는 "+ages[i]+"세, 취미는 "+hobbies[i]+"입니다.");
//		}
        for (int i = 0; i < size; i++) {
            info(names[i], ages[i], hobbies[i]);
        }
    }

    public static void info(String name, int age, String hobby) {
        System.out.println("나의 이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "세, 취미는 " + hobby + "입니다.");
    }

}
