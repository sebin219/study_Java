package inherit;

public class SmartPhone extends Phone {
    // 필드 2개, color, model ---> 3개
    // 메서드 4개 ---> 6개

    public boolean wifi; //클래스 바로 아래 선언된 필드는 자동초기화가 됨
    // false로 자동 초기화

    // color, model을 개체 생성시 초기화를 하고 싶은 경우


    public SmartPhone(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // 메소드 선언
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }

}
