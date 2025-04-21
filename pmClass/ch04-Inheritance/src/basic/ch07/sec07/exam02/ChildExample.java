package basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // Child 타입으로 Child 객체를 만듦
        // 즉, 자식타입 객체 생성
        Child child = new Child();

        // 부모타입 -> child를 업캐스팅
        Parent parent = child;

        parent.method1(); //Parent-method1()
        parent.method2(); //Parent-method2()
//        parent.method3(); -> 호출 불가능
    }
}
