package advanced.ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");

        // 문장을 단어 스트림으로 변환 후 출력
        list1.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))  // 단어 단위로 분할
                .forEach(System.out::println);

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");

        // 숫자 문자열을 정수 스트림으로 변환 후 출력
        list2.stream()
                .flatMapToInt(str -> Arrays.stream(str.split(","))
                        .map(String::trim)  // 공백 제거
                        .mapToInt(Integer::parseInt)) // 정수 변환
                .forEach(System.out::println);
    }
}