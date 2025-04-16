package basic.ch04.sec02;

import java.util.Random;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20) + 81;
        // Math.random : 0.0 ~ 1.0미만 난수 반환(더블)
        System.out.println("점수: "+score);

        String grade;

        if(score>=90){
            if(score>=95){
                grade = "A+";
            }else{
                grade = "A";
            }
        } else {
            if(score>=85){
                grade="B+";
            }else{
                grade="B";
            }
        }
        System.out.println("학점: "+grade);

    }
}
