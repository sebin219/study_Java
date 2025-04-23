package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // 1. split()을 사용한 이름 추출
        String data1 = "홍길동&이수홍,박연수";
        // 먼저 &를 ,로 바꾸면 하나의 구분자로 split 가능
        String[] names1 = data1.replace("&", ",").split(",");
        for (String name : names1) {
            System.out.println(name);
        }

        System.out.println(); // 줄 바꿈

        // 2. StringTokenizer를 사용한 이름 추출
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
