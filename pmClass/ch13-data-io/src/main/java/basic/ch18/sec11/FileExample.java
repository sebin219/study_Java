package basic.ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileExample {
    public static void main(String[] args) throws Exception{
        //File 객체 생성
        File dir = new File("c:/TEMP/images");
        File file1 = new File("c:/TEMP/file1");
        File file2 = new File("c:/TEMP/file2");
        File file3 = new File("c:/TEMP/file3");

        //존재하지 않는다면 디렉토리 또는 파일 생성
        if(!dir.exists()) {dir.mkdirs();}
        if(!file1.exists()) {file1.createNewFile();}
        if(!file2.exists()) {file2.createNewFile();}
        if(!file3.exists()) {file3.createNewFile();}

        //Temp 폴더의 내용을 출력
        File temp = new File("c:/TEMP");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for(File file : contents){
            System.out.printf("%-25s", sdf.format(new java.util.Date(file.lastModified()))); // 수정된 부분
            if(file.isDirectory()){
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}