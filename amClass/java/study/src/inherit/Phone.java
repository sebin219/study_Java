package inherit;

public class Phone {
    //필드 선언
    public String model;
    public String color;

    // Phone p = new Phone(); 객체 생성 시 클래스명()를 자동 호출
    // 클래스 이름과 동일하게 생긴 메서드
    // (생성자 메서드, 생성자, constructor)
    // 컴파일러가 생성자가 하나도 없을 때 자동으로 하나는 만들어서 넣어줌
    // 파라미터가 없는 생성자를 기본생성자(default constructor)라고 함
    // public Phone(){
    // }

    //메소드 선언
    public void bell() {
        System.out.println("벨이 울립니다.");
    }
    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }
    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }
    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
