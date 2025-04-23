package ch12.sec08;

import java.util.*;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; // 월은 0부터 시작하기에 +1
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK); // 요일 (1=일요일, 2=월요일, ...)
        int amPm = now.get(Calendar.AM_PM);       // 오전(0), 오후(1)
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        // 요일 문자열 변환
        String[] weekNames = { "", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
        String strWeek = weekNames[week];

        // 오전/오후 문자열 변환
        String strAmPm = (amPm == Calendar.AM) ? "오전" : "오후";

        // 결과 출력
        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(strWeek + " " + strAmPm);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}