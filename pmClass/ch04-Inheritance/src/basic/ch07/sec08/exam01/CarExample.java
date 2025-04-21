package basic.ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        //Tire 타입의 tire속성이 정의되지 않음

        //Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run();

        //HankookTire 객체 장착
        myCar.tire = new HankookTire();
        myCar.run();

        //KumhoTire 객체 장착
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
