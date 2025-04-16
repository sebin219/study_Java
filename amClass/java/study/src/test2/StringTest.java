package test2;

public class StringTest {
    public static void main(String[] args) {
        String s0 = null;
        //힙 영역에 값을 넣지는 않음. 주소없음을 의미
        System.out.println(s0);

        String s1 = "자바";
        //한 줄 복사: ctrl + d
        String s2 = "자바";
        //주소가 동일한지 체크
        System.out.println(s1==s2);
        //참조형은 ==은 주소 비교

        String s3 = new String("자바");
        System.out.println(s1==s3);
        //String 타입 변수(주소)가 가르키는 값이 동일한지 체크
        System.out.println(s1.equals(s3));
    }
}
