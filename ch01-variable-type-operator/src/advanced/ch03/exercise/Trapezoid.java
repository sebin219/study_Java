package advanced.ch03.exercise;

public class Trapezoid {
    public static void main(String[] args) {
     int lengthTop = 5;
     int lengthBotton = 10;
     int lengthHeight = 7;
     double area = (lengthTop + lengthBotton)*lengthHeight/2.0;
        System.out.printf("사다리꼴의 넓이는 %f입니다.", area);
    }
}
