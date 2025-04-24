package library;

public class BagTest {
    public static void main(String[] args) {
        //보내는 쪽
        Bag bag = new Bag();
        bag.setAge(100);
        bag.setName("김국민");

        //받는 쪽
        System.out.println("나이는 " + bag.getAge());
        System.out.println("이름은 " + bag.getName());

        System.out.println(bag);
        //toString()오버라이드하면 필드값을 한번에 확인할 수 있다.
    }
}
