package basic.ch13.sec02.exam02;

public interface Rentable<P> {

    // 반환 타입 P인 rent라고 하는 추상 메서드 -> 상속이나 implements 할때 정의해야함
    P rent();
}
