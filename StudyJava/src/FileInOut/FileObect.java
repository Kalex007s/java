package FileInOut;

import java.io.File;
import java.io.IOException;

public class FileObect {
    //정적영역에 정적변수를 만든 작업
    public static final String Current =
            "C:\\Users\\admin\\Documents\\Github\\java\\study001\\temp";

    public static void main(String[] args) {
        String currentPatch = System.getProperty("user.dir");
        System.out.println(currentPatch);
        //절대경로
        File temeDir = new File("C:\\Users\\admin\\Documents\\Github\\java\\study001\\temp");
        if (temeDir.exists()) {
            System.out.println("폴더를 이미 존재합니다.");
        }else {
            System.out.println("폴더를 새로 생성합니다.");
            temeDir.mkdir(); // make directory
        }
        //파일생성
        File newFile = new File(Current+"/newFile.txt");
        if (!newFile.exists()){
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("이미 파일이 존재합니다.");
        }

        //File 객체가 가르키는 대상(폴더 또는 파일)의 절대경로 확인
        System.out.println("절대경로 위치 : "+newFile.getAbsolutePath());
        System.out.println("newFile = " + newFile);
        
    }
}
