package basic.ch04.sec05;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.printf("1~100 합: %d", sum);
    }
}
