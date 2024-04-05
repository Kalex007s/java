package HomeWork.HW02;

import java.util.Arrays;
import java.util.Locale;

public class Q1 {
    public static void main(String[] args) {
        // String 문자열의 소문자는 대문자로, 대문자는 소문자로 변경시킨
        // String 문자열을 리턴하는 메서드(changeCase)를 완성하시오
        String str = "cHanGe CasE";
        String result = changeCase(str);
        System.out.println(result); // ChANgE cASe
    }

    public static String changeCase(String str) {

        String[] strings = new String[11];
        char[] chars = str.toCharArray();
        for (int i = 0; i < strings.length; i++) {
            chars = chars[i];
            if()
        }

        return Arrays.toString(changeStr);
    }

}
//String str3 = "";
//char[] str1 = new char[str.length()];
//str1 = str.toCharArray();
//char[] result = new String[str.length()];
//
//        for (int i = 65, j=0; i < 90; i++){
//        if(str){
//str1[i] = str1
//            }
//                    }
//                    return result;