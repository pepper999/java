package test01_list;

import java.util.ArrayList;
import java.util.List;

// List
// 순서가 있다
// 중복 허용
public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        // 추가
        names.add("A"); // 리스트 맨 뒤에 추가
        names.add("B");
        names.add("C");
        names.add("D");
        System.out.println(names); // ArrayList에 toString 정의 되어 있기 때문
        
        System.out.println(names.isEmpty()); // 비어 있는지 확인
        
        // 수정
        names.set(0, "AAA"); // 인덱스 자리 엘리멘트를 변경
        System.out.println(names);
        
        // 조회
        for (String name : names) {
            System.out.println(name);
        }
        
        // 삭제
        names.remove(0); // 인덱스 활용
        System.out.println(names);
        
        names.remove("B"); // 값을 이용한 삭제
        System.out.println(names);
        
        names.clear(); // 전부 삭제
        System.out.println(names);
        
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        
        System.out.println(names.contains("A")); // 포함 여부 확인
        
        List<String> names2 = new ArrayList<>();
        names2.add("E");
        names2.add("F");
        names.addAll(names2); // 콜렉션끼리 더하기
        System.out.println(names);
        
    }
}
