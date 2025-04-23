package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")               // "DEF"를 추가 => 현재 문자열: "DEF"
                .insert(0, "ABC")  // 0번째 인덱스에 "ABC"를 삽입 => "ABCDEF"
                .delete(3, 4)               // 3번째 인덱스(D)를 삭제 => "ABCEF"
                .toString();                // 최종 결과를 String 타입으로 변환
        System.out.println(data);
    }
}
