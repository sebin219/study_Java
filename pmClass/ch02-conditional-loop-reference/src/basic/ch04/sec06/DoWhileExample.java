package basic.ch04.sec06;

public class DoWhileExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%3==0){
                sum+=i;
            }

        }
        System.out.printf("3의 배수의 총합은 %d입니다.", sum);
    }
}
