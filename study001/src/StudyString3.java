import java.awt.*;
import java.util.Arrays;

public class StudyString3 {
    public static void main(String[] args) {
        //문자열 수정
        // @toLowerCase(), toUpperCase
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        //@replace()
        System.out.println(str1.replace("study","공부"));

        //@spilt
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));

        //@trim
        System.out.println("   abc   ".trim());

        System.out.println();

        //문자열의 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("Java");

        //@stack 메모리 비교 (==): 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);

        //@equals(), equalsIgnoreCase(): 내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));

        String str5 = "Java Study";
        //Study를 못찾으면 변경하지 않고 원본 그대로 둠
        System.out.println(str5.replace("study","공부")); // 대소문자 구분

        //두번째 파라미터로 사용된 인덱스는 포함되지 않음 (0<= 범위 < 5)
        System.out.println(str5.substring(0,5));

        //연산자를 이용하여 ':'와 '/'기준으로 분리시킴
        String[] strArray1 = "Name:Michael/Man".split("|/ "); //쪼개서 배열에 담아 저장한다.
        //split 매소드의 리턴형은 String[] 문자열의 배열이다!! (매우중요)
        System.out.println(Arrays.toString(strArray1));

        //"앞뒤 공백 지우기
        String _str5 = "   abc def   ";
        _str5 = _str5.trim(); // : "앞뒤 공백'만' 지운다.
        System.out.println(_str5);
        // 모든 공백 지우기 (매우 활욜도가 높음)
        System.out.println(_str5.replaceAll(" ", "")); // regex를 찾아서 replacement 로 바꿔라
        //"" = 공백이 없다 = 객체에서 공백이 없다는 Null=> 없는 것으로 바꿔라.
        //String str="Tom";
        //str="";

    }
}
