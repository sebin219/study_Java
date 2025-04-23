package ch11.sec02.exam01;

public class ExceptionHandlingExample {
    public static void printLength(String data){
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage()); //예외 객체의 메시지 출력
            System.out.println(e.toString());
            e.printStackTrace(); //스택 추적 내용 모두 출력
        } finally {
            System.out.println("[마무리 실행]");
        }

    }
    public static void main(String[] args) {

        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); //data가 null이므로 NullPointerException 에러 발생
        System.out.println("[프로그램 종료]");
    }
}
