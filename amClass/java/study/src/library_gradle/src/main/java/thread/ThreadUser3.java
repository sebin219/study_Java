package thread;

//하나의 java 소스파일에는 여러 개의 클래스를 정의 가능하다.
class Thread11 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("어제는 월요일");
            // 해당 스레드를 1초 일시정지 시켜줘.
            try {
                Thread.sleep(1000);
                // cpu핸들링(외부 자원에 해당)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // 자바 이외의 자원, 네트워크, 파일 연결 등은 반드시 예외처리
        } //for
    } //run
} //class(괄호 닫히는곳 표시해두면 편함)

public class ThreadUser3 {
    public static void main(String[] args) {
        Thread thread11 = new Thread11();
        // Thread11 클래스는 Thread 클래스를 상속한 클래스
        // 그래서 Thread11 객체를 생성하면 Thread 타입으로도 사용 가능
        // Thread thread11: 변수 thread11을 Thread 타입으로 선언
        // = new Thread11() : Thread11 클래스의 인스턴스를 하나 만든 것
        // => 즉, Thread11 타입 객체를 생성해서 부모 클래스인 Thread 타입 변수에 저장한 것(업캐스팅(자동 형변환-자식 객체를 부모타입에 넣은 것))
        thread11.start(); //실행 대기줄에 넣어줘.

        //멀티스레드 3개를 만들어서 동시에 돌리자.
        //1. Runnable 인터페이스의 run()메서드를 재정의한 클래스 생성
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("오늘은 화요일");
                    // 해당 스레드를 1초 일시정지 시켜줘.
                    try {
                        Thread.sleep(1000);
                        // cpu핸들링(외부 자원에 해당)
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    // 자바 이외의 자원, 네트워크, 파일 연결 등은 반드시 예외처리
                }//for
            }//run
        });//class
        thread2.start();

        //2. Thread 상속해서 run()메서드 재정의한 클래스 생성
        // 익명클래스
        Thread thread3 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("내일은 수요일");
                    // 해당 스레드를 1초 일시정지 시켜줘.
                    try {
                        Thread.sleep(1000);
                        // cpu핸들링(외부 자원에 해당)
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    // 자바 이외의 자원, 네트워크, 파일 연결 등은 반드시 예외처리
                } //for
            }//run
        }; //익명클래스
        thread3.start();
    }
}
