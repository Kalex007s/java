package FileInOut;

import java.io.*;

public class FileInputStream1 {
    public static void main(String[] args) throws IOException {
        //파일 데이터 입력
        //1. 파일 대상 설정
        File infile = new File(FileObect.Current+"/file1.txt");
        if(!infile.exists()){
            infile.createNewFile();
        }
//        else {
//            System.out.println("이미 파일이 존재합니다.");
//        }
        //2. 대상에 연결과는 stream 생성
        InputStream is = new FileInputStream(infile);
        //3. 데이터 읽기
        int data;
        while ((data= is.read())!=-1){
            System.out.println("읽은 데이터 : "+(char)data +
                    "남은 바이트 : "+is.available());
        }
        //4.stream 종료
        is.close();
    }
}
