package StudyGroup.Study0513;

import java.util.ArrayList;
import java.util.Scanner;

class Script {
    Scanner scanner = new Scanner(System.in);
    String script = scanner.nextLine();
    String word = scanner.nextLine();
    public int countString() {
        String [] arrayScript = new String[script.length()];
        int count = 0;
        for (int i = 0; i < script.length(); i++) {
            arrayScript[i] = String.valueOf(script.toCharArray()[i]);
        }
        for (int i = 0; i < arrayScript.length; i++) {
            if (word.equalsIgnoreCase(arrayScript[i])) {
                count++;
            }
        }
        return count;
    }
}
public class HW02 {
    public static void main(String[] args) {
        //사용자가 하나의 글을 입력했을때, 그 글에 사용자가 원하는 믄자 혹은 문자열이 몇개 들어있는지를 찾아내는 코드를 작성
        //조건 1)  글과 문자 혹은 문자열은 사용자에게 입력받아야 한다.
        //조건 2)  사용자가 찾고자 하는 문자 혹은 문자열은 종류에 구애받지 않는다.

        Script script = new Script();
        System.out.println(script.countString());
    }
}
