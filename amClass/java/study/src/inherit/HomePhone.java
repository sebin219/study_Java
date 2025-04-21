package inherit;

public class HomePhone extends Phone{

    // 메서드이름 쓰고 엔터!
    @Override //표시(annotation)가 붙음.
    //Phone에 있는 bell()과 동일한 지 체크해줌
    public void bell() {
        System.out.println("따르릉 울리다");
    }

    @Override
    public void hangUp() {
        System.out.println("철컥 전화기를 내리다.");
    }
}
