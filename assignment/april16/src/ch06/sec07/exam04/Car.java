package ch06.sec07.exam04;

public class Car {
    //필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;


    //생성자 선언
    // 기본 생성자
    Car() {
    }

    // model만 받는 생성자
    Car(String model) {
        this.model = model;
    }

    // model과 color를 받는 생성자
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // model, color, maxSpeed를 받는 생성자
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
