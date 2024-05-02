package StudyGroup.Study0430;

/* 참고자료 0430(3) 파일 참고해서 코드 작성

1. 모든 문장을 하나의 변수에 저장 후 출력하시오.
2.str1의 길이를 구하시오.
3.str2에서 처음나오는 숫자의 인덱스 번호를 구하시오.(단 앞에서부터 count 하는 것을 를 기본으로 함)
4. 1번의 변수에 a가 몇개 들어있는지를 구하시오.

 */
public class Example03 {
    public static void main(String[] args) {
        String str1 = "Hello, My name is Alex, nice to meet you.";
        String str2 = "I am 26. but I'm still student.";
        // 1번
        String str3 = str1.concat(str2);
        System.out.println(str3);
        // 2번
        int str1Length = str1.length();
        System.out.println(str1Length);
        // 3번
        int indexNumByNum = str2.indexOf("2");
        System.out.println(indexNumByNum);
        // 4번
        int count = 0;
        for (int i = 0; i < str3.length(); i++) {
            if(Character.toString(str3.charAt(i)).equals("a")){
                count++;
            }
        } System.out.println(count);
    }

}
