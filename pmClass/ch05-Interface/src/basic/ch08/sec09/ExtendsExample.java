package basic.ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImp1 impl = new InterfaceCImp1();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceA ib = impl;
        ib.methodA();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
