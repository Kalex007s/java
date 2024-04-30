package StudyGroup.Study0430;

import JavaInterface.A;

import java.util.Arrays;

/* 참고자료 0430(2) 파일 참고해서 코드 작성

1. 참고자료 0430(2) 모습을 출력하시오.
[조건 : 메서드 사용]
2. str1의 '!'를 '하세요'로, '나는'을 '저는'으로 변경하여 출력하시오.
3. 안녕하세요. 나는 '김개똥' 입니다!만나서 반갑습니다^^ //를 출력하시오.
4.str3의 도메인(naver.com)과 아이디(조건:소문자)를 출력하시오.
5.뒤죽박죽인 str4에서 특수문자를 모두 제외하고 출력하시오.

 */
public class Example02 {
    public static void main(String[] args) {
        String str1 = "안녕! 나는 '김개똥'입니다";
        String str2 = "만나서 반갑습니다^^";
        String str3 = "kgDD123@naver.com";
        String str4 = "안녕!하세요@앞으로*잘부$탁!드립니다@";
        // 1번
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        // 2번
        String str5 = str1.replace("!","하세요");
        str5 = str5.replace("나는","저는");
        System.out.println(str5);
        // 3번
        String str6 = str1.concat(str2);
        System.out.println(str6);
        // 4번
        String str7 = str3.substring((str3.indexOf("@"))+1);
        System.out.println(str7);
        String str8 = str3.substring(0,str3.indexOf("@"));
        System.out.println(str8.toLowerCase());
        // 5번
        String str9 = str4.replaceAll("[^a-zA-Z0-9가-힣]", "");
        System.out.println(str9);
    }
}
