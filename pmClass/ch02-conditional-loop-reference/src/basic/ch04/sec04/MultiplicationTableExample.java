package basic.ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        int num = 0;
        int i = 0;
        for (num=2;num<=9;num++){
            System.out.printf("*** %d단 *** \n", num);
            for(i=1;i<=9;i++){
                System.out.printf("%d x %d = %d\n", num, i, num*i);
            }
        }
    }
}
