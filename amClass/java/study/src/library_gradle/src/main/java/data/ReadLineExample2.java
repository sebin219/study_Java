package data;

import java.io.*;

public class ReadLineExample2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("c:/TEMP/Hello.java");
            BufferedReader bs = new BufferedReader(reader);

//            BufferedWriter bw = new BufferedWriter(new FileWriter("c:/TEMP/Hello.java"));
            //buffer(버퍼는 임시 기억 장치, 많은 양을 넣을 수 있음)
            while(true){
                String str = bs.readLine();
                if (str == null) break;
                System.out.println(str);
            }
            reader.close();
            bs.close();

        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("읽어올 때 에러 발생함.");        }
    }
}
