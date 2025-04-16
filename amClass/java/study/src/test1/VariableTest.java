package test1; //; 생략 불가능, package맨위

// int x = 100; //모든 변수는 class안으로 들어가야함. 전역변수 없음.
public class VariableTest {
    public static void main(String[] args) {
        // 이 부품은 독립적으로 실행할 수 있는 부품이 됨.
        // 함수인데, 만약에 함수가 여러개인 경우 무조건 main()을 호출!
        // 타입 변수명; --> 변수가 생성됨. 선언이라고 함
        // 자바는 변수에 들어갈 타입이 선언할 때 결정됨(정적 타입핑)
        //기본형 4가지: 정수, 실수, 문자1, 논리
        //정수: byte(1), short(2), int(4), long(8)
        byte age = 127; //변수는 소문자로 시작해야함
        short year = 2025;
        int hit = 2100000000;
        long money = 2200000000L; //l(L)

        //실수: float(소수점 7,4바이트), double(15, 8바이트)
        float w = 70.5F; //f(F)
        double h = 170.0000055;

        //문자 한글자: char
        char gender = '여'; //'홑따옴표 사용

        //논리형: boolean
        boolean flag = true; //false

        System.out.println("내 나이는 "+age+"세야.");
        //+연산자가 하나라도 문자열이면 결과는 string(결합연산자)
        System.out.println("내 몸무게 "+ w + "kg이야.");
        System.out.println("내 성별은 "+ gender + "이야.");
        System.out.println("나는 오늘 아침을 먹었을까? "+ flag);

        String name = "김국민"; //" 이중 따옴표
        String plan = """
                나는
                훌륭한
                자바 개발자가 되리라.
                """; //""" 여러 줄 작성
        System.out.print("출력하고 엔터치지마"); //print는 엔터없이 끝냄
        System.out.println("내 이름은 "+ name);
        System.out.println("내 계획은 "+ plan); //한 줄 복사(ctrl+D)
        System.out.printf("내 이름은 %s이야.\n", name); //printf는 형식을 지정하고, 형식에 넣을 변수 작성 가능
        System.out.printf("내 몸무게는 %.2f이고, 내 키는 %8.3f이야.\n", w, h);
    }
}
