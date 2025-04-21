package basic.ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("갤럭시", "실버");
        /*
        * 상속
        * - 부모가 가지고 있는 재산(멤버)를 자식이 물려받음을 의미
        * - 단순히 물려받는 것보다,
        * */

        System.out.println("myPhone.color = "+myPhone.color);
        System.out.println("myPhone.model = "+myPhone.model);

        myPhone.printModel();
    }
}
