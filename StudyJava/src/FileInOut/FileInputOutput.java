package FileInOut;
//범용성이 좋다.
import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        //쓰기
        File file = new File(FileObect.Current+"/fileio.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        OutputStream os = new FileOutputStream(file, false);
//        byte[] arrayByte = "Hello, World. Let's study string framework".getBytes();
        byte[] arrayByte = "안녕하세요.".getBytes(Charset.forName("UTF-8"));
        os.write(arrayByte);
        os.flush();
        os.close();

        //읽기
        InputStream is = new FileInputStream(file);
        int data=0;
        byte[] buffer = new byte[10000];
        String str = "";
//        while (data!=-1) {
//            data = is.read(buffer);
//            if (data >= 0) {
//                str = str + new String(buffer, 0, data, Charset.forName("UTF-8"));
//            }
//        }
        while ((data = is.read(buffer))!= -1){
            str = str + new String(buffer,0,data,Charset.forName("UTF-8"));
        }

        System.out.println(str);
        is.close();
    }
}
