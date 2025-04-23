package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        // 시작 시간 측정
        long startTime = System.nanoTime();

        long sum = 0;
        for (int i = 1; i <= 1_000_000; i++) {
            sum += i;
        }

        // 종료 시간 측정
        long endTime = System.nanoTime();

        // 결과 출력
        System.out.println("1부터 1,000,000까지의 합: " + sum);
        System.out.println("소요 시간: " + (endTime - startTime) + " ns");
    }
}
