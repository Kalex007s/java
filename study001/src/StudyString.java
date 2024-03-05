import java.util.Arrays;

public class StudyString {
    public static void main(String[] args) {

        //String 클래스의 첫번째 특징
        //객체의 값을 변경하면 새로운 객체를 생성 (주소값이 새로운 주소로 변경)
        //String 객체 변수는 값이 수정되지 않고 항상 새로운 값을 만듦!
        String str0 = new String("start!");
        String str00 = str0;
        System.out.println(str0);
        System.out.println(str00);

        String str1 = new String("안녕");
        String str2 = str1;
        str1 = "안녕하세요";
        System.out.println(str1);
        System.out.println(str2);

        //String 클래스의 두번째 특징
        //리터럴로 입력하는 경우 해당 문자열은 재사용(=공유)함
        //리터럴로 입력되는 값은 런타임이전에 이미 메모리에 만들어짐
        String str5 = "start";
        String str6 = "start";
        String str7 = new String("start");
        System.out.println(str5 == str6);
        System.out.println(str5 == str7);
        System.out.println(str5.equals(str7)); //문자열자체를 비교하면 true

        //문자열의 '+'연산
        String a1 = "안녕" + "하세요" + "!";
        System.out.println(a1); //안녕하세요!

        String a2 = "반갑";
        a2 += "습니다";
        a2 +="!";
        System.out.println(a2); //반갑습니다!
        System.out.println();

        String aa1 = "Hello";
        String aa2 = "World";
        System.out.println(aa1 + " " + aa2);

        //문자열과 숫자의 '+'연산
        System.out.println(1 + "Hi"); // 1Hi
        System.out.println(1 + 2 + "Hi"); // 3Hi
        System.out.println("Hi" + 1 + 2); // Hi12 // 1. Hi+1 = Hi1 2. Hi1 + 2 = H12 (Hi1 은 문자열이 되었기 때문에 듸에 오는 숫자와 더할 수 업다)
        System.out.println("Hi" + 1 + 2 + 3); // Hi123
        System.out.println(1 + "Hi" + 2); // 1Hi2

        // deprecated : 바뀐 버전이 있으니 확인 후 바뀐 버전을 사용해라


        //문자열 수정
        String srt10 = new String("안녕");
        String str11 = srt10;

        String str10 = "안녕하세요";

        System.out.println(str10);
        System.out.println(str11);

        //배열의 참조 자료형
        int[] array10 = new int[] {3,4,5};
        int[] array11 = array10;
        array10[0] = 6;
        array10[1] = 7;
        array10[2] = 8;

        System.out.println(Arrays.toString(array10));
        System.out.println(Arrays.toString(array11));

        //리터럴을 바로 입력한 데이터는 문자열이 같을 때 하나의 객채를 공유
        String str20 = new String("안녕"); // 새로운 저장공간을 할당한 뒤 저장
        String str21 = "안녕"; // 새로운 저장공간을 할당한 뒤 저장;; 같은 "안녕"이지만 컴파일 단계에서 str20과 str21, str23은 새로운 저장공간을 할당해서 만들었다
        String str22 = "안녕"; // 컴파일 단계에서 생성된 str21, str22를 생성하려 보니 str21과 같은 값을 가졌기 때문에 str22는 str21과 같은 객채를 공유한다.
        String str23 = new String("안녕");

        

    }
}
