package basic.ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        /*
        * 선언 방법
        * 1. 변수 선언
        * 2. 변수 초기화
        * 3. 변수 쓰기
        *
        * 선언 방법
        * 자료형 변수명;
        *
        * 자료형
        * -> 다양한 값의 형태별로 어느정도의 크기를 하나의
        * 값으로 취급할 것인지 미리 compiler와 약속하는 키워드
        * */

        //정수형
        byte bnum;  //1byte=8bit
        short snum; //2byte
        int inum;   //4byte //대표 자료형
        long lnum;  //8byte

        //실수형
        float fnum;  //4byte
        double dnum; //8byte //대표 자료형

        //문자형
        char ch;     //2byte

        //논리형
        boolean isTrue; //1byte

        //문자열
        String str; //주소를 담기 때문에 대략적으로 4byte

        int hour = 3;
        int minute = 5;

        int totalMinute= hour*60+minute;
        System.out.println(hour+"시간 "+minute+"분" );
        System.out.println("총 "+ totalMinute+"분");
    }
}
