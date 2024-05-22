package FileInOut;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStream1 {
    public static void main(String[] args) throws IOException {
        //파일 데이터 출력
        //1. 파일 대상 설정
        File outFile = new File(FileObect.Current+"/file2.txt");
        if(!outFile.exists()){
            outFile.createNewFile();
        }
        //2. 대상에 연결되는 stream 생성
        OutputStream os = new FileOutputStream(outFile);
        //3. 1-byte 단위 데이터 쓰기
        os.write('J');
        os.write('A');
        os.write('V');
        os.write('A');
        os.write('\r'); //캐리지 리턴(carrige return)
        os.write('\n'); //라인 피드(line feed)
        os.write('A');
        os.write('\r'); //캐리지 리턴(carrige return)
        os.write('\n'); //라인 피드(line feed)

        //버퍼에 담겨있는 데이터를 파일에 쓰는 메서드
        os.flush();
        //4.stream 종료
        os.close();

        //여러 바이트를 한꺼번에 쓰는 예제
        //두번째 파라미터(boolean append)는 기존 파일에 있던 데이터를 삭제하고 쓸지
        //뒤에 이어서 쓸지 결정하는 것(true = 이어쓰기)
        OutputStream os2 = new FileOutputStream(outFile, true);
        // append = 뒤에 붙이라는 의미 -> flase일 때는 파일의 데이터가 지워지고, true일때는 기존 데이터에 이어 데이터가 쓰여진다.
        byte[] byteArray = "Spring and Database\r\n".getBytes();
        // getBytes()는 문자열을 바이트 배열로 변경시켜주는 메서드
        os2.write(byteArray);
        // write()는 매게변수에 바이트배열 형태로 넣어주면 배열에 담긴 데이터를 모두 쓴다.
//        os2.write('\r');
//        os2.write('\n'); //하나만 써도 됨.
        os2.flush();
        os2.close();

        //append가 false일때,
//        OutputStream os3 = new FileOutputStream(outFile, false);
//        // append = 뒤에 붙이라는 의미 -> flase일 때는 파일의 데이터가 지워지고, true일때는 기존 데이터에 이어 데이터가 쓰여진다.
//        byte[] byteArray1 = "All remove".getBytes();
//        os3.write(byteArray);
//        os3.write('\r');
//        os3.write('\n');
//        os3.flush();
//        os3.close();
    }
}
