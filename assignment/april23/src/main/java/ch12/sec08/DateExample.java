package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        // 현재 날짜와 시간
        LocalDateTime now = LocalDateTime.now();

        // 원하는 포맷 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");

        // 포맷 적용 후 출력
        String formattedDate = now.format(formatter);
        System.out.println("현재 날짜: "+formattedDate);
    }
}