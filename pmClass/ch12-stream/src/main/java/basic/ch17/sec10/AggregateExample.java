package basic.ch17.sec10;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 2의 배수만 필터링
        int[] filtered = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .toArray();

        // 2의 배수 개수
        long count = Arrays.stream(filtered).count();
        System.out.println("2의 배수 개수: " + count);

        // 2의 배수 총합
        int sum = Arrays.stream(filtered).sum();
        System.out.println("2의 배수의 합: " + sum);

        // 2의 배수 평균
        OptionalDouble avg = Arrays.stream(filtered).average();
        System.out.println("2의 배수의 평균: " + (avg.isPresent() ? avg.getAsDouble() : "없음"));

        // 2의 배수 중 최댓값
        OptionalInt max = Arrays.stream(filtered).max();
        System.out.println("최대값: " + (max.isPresent() ? max.getAsInt() : "없음"));

        // 2의 배수 중 최솟값
        OptionalInt min = Arrays.stream(filtered).min();
        System.out.println("최소값: " + (min.isPresent() ? min.getAsInt() : "없음"));

        // 첫 번째 3의 배수
        OptionalInt first3 = Arrays.stream(arr)
                .filter(n -> n % 3 == 0)
                .findFirst();
        System.out.println("첫 번째 3의 배수: " + (first3.isPresent() ? first3.getAsInt() : "없음"));
    }
}