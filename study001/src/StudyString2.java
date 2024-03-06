import java.util.Arrays;

public class StudyString2 {
    public static void main(String[] args) {
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println("문자열의 길이");
        System.out.println(str1.length());//프로그램에서 Retrun 값은 결과값을 의미한다.
        System.out.println(str2.length());
        System.out.println();

        //문자열의 검색
        System.out.println(str1.charAt(1)); // ()안에 들어가야 할 것이 위에 작게 설명으로 팝업되어있다.
        System.out.println(str1.indexOf('a')); // 인덱스의 위치를 알려줌
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str1.indexOf('a',8));//char 뒤에 정보를 하나 입력하므로 추가 정보를 제공 -> 결과값 변경
        // = 메소드의 활용도를 높이려면 정보를 하나만 주는것이 아니라 여러가지 정보를 입력해주면 된다.
        //근거값을 유츄 = 처음나온 'a'값에 다음 값으로 시작 :: 결과값에 -1이 나오면 끝이라는 소리
        /* .indexof (code)
        public int indexOf(int ch, int fromIndex) {
        return isLatin1() ? StringLatin1.indexOf(value, ch, fromIndex, length())
                : StringUTF16.indexOf(value, ch, fromIndex, length());
        * */

        System.out.println(str1.indexOf("Java"));
        //워드를 검색하면 첫 글자의 위치를 표기한다. *대소문자 구분 *스페이스도 인덱스를 가진다.


        //문자열 변환 및 연결
        //String str3 = 2.3; 서로 타입이 다르기 때문에 에러
        String str3 = String.valueOf(2.3); //타입에 변화를 강제로 시켜줌
        //String str4 = String.valueOf(false);
        boolean bool = false;
        String str4 = String.valueOf(bool);
        System.out.println(str3);
        System.out.println(str4);

        // 문자열의 연결

        String str5 = str3.concat(str4); // 앞에올 문자열.concat(뒤에 올 문자열)
        //사용예).  은행 고객 = '김수중'+'님'
        System.out.println(str5);

        String str8 = "Hello Java!";
        String str9 = "안녕하세요";
        //문자열 byte[] 변환
        byte[] array1 = str8.getBytes();//.getBytes 는 실제 코드를 보여줌
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        //문자열 char[] 변환
        char[] array3 = str8.toCharArray();
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println(array3);




    }

}
