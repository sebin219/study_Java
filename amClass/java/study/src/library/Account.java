package library;

public class Account {
    try {
        findClass();
    } catch(ClassNotFoundException e) {
        System.out.println("호출한 곳에서 예외 처리함.: " + e.toString());
    }


public static void findClass() throws ClassNotFoundException {
    Class.forName("java.lang.String2");
}}
