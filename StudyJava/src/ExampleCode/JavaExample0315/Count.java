package ExampleCode.JavaExample0315;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님
        String str = "This is a really simple sentence";
        //모음 = vowels,자음 = Consonant
        String removeSpace;
        int vowelsCount = 0;
        int counsonantCount = 0;
        removeSpace = str.replace(" ", "");

        for (int i=0;i<removeSpace.length();i++) {
            if (removeSpace.charAt(i)=='a' || removeSpace.charAt(i)=='e' ||
                    removeSpace.charAt(i)=='i' ||removeSpace.charAt(i)=='o' || removeSpace.charAt(i)=='u'){
                vowelsCount++;
            }
            else if (removeSpace.charAt(i)>(int)'a'||removeSpace.charAt(i)<=(int)'z'){
                counsonantCount++;
            }
        }
        System.out.println("모음 갯수는 "+ vowelsCount);
        System.out.println("자음 갯수는 "+ counsonantCount);



        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님

        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("원하시는 문장을 작성해 주십시오.");
        String str = sc.nextLine();

        //모음 = vowels,자음 = Consonant
        String removeSpace;
        int vowelsCount = 0;
        int counsonantCount = 0;
        removeSpace = str.replace(" ", "");
        removeSpace = removeSpace.toLowerCase();

        for (int i=0;i<removeSpace.length();i++) {
            if (removeSpace.charAt(i)=='a' || removeSpace.charAt(i)=='e' ||
                    removeSpace.charAt(i)=='i' ||removeSpace.charAt(i)=='o' || removeSpace.charAt(i)=='u'){
                vowelsCount++;
            }
            else if (removeSpace.charAt(i)>(int)'a'||removeSpace.charAt(i)<=(int)'z'){
                counsonantCount++;
            }
        }
        System.out.println("모음 갯수는 "+ vowelsCount);
        System.out.println("자음 갯수는 "+ counsonantCount);*/
    }
}
