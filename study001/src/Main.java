public class Main {
    public static void main(String[] args) {
        //switch case
       /*
        int a = 2;

        switch (a) {
            case 1:
                System.out.println("Java0313.ExampleCode.A");
            case 2:
                System.out.println("Java0313.ExampleCode.B");
                break;
            case 3:
                System.out.println("Java0313.C");
            default:
                System.out.println("Java0313.D");
        }
        */

        //콘솔화면에 출력해보자

        /*
        System.out.println("콘솔 화면에 출력");

        System.out.println("화면 출력");
        System.out.println("화면 + 출력");
        System.out.println("3.8");
        System.out.println("3+5");
        System.out.println("화면"+3);
        System.out.println("화면"+3+5);
        //연산은 순서대로 진행됨으로 "화면"+3 연산 후 (화면3) +5  = 화면35
        System.out.println(3+5+"화면");
        System.out.println("화면"+(3+5));
        */

       /*
        //변수에 넣어 출력

        int a = 3;
        String b = "화면";
        System.out.println(a);
        System.out.println(b);
        System.out.println(b+"출력");
        System.out.println(a+b+"출력");

        // 한 줄로 출력하기
        System.out.print("3");
        System.out.print("화면");
        System.out.print("출력");
        */

        //줄바꿈 (\n 을 이용)
        /*
        System.out.print("안녕하세요\n여러분");
        System.out.println("\n안녕하세요\n여러분");
        System.out.println("안녕하세요.\n반갑습니다. 여러분");
        */

        /*
//        변수 선언과 값을 대입하는 2가지 방법
//        1.변수선언과 함께 값을 대입
        int a = 10;
//        2.변수선언과 값대입 분리
        int age;
        age = 26;
        System.out.println(a);
        System.out.println("age is " + age);
*/


/*
//변수와 상수명 짓기

//변수
        boolean aBcD; // 대문자는 새로운 단어 및 글자 사이에 사용권장
        byte 가나다; // 한글 작성 가능 (권장하지는 않음)
        short _abcd;
        char $ab_cd;
//        int 3abcd; // 숫자는 이름 맨 앞에 올 수 없음
        long abcd3;
//        float int //자바예약에는 쓸 수 없음.
        double main;
        //int my WOrk //스페이스, 복수키는 사용 할 수 없음
        String myCalassName;
        int ABC; //전부 대문자로 작성(권장하지않음)

//        상수
        final double PI;
        final int MY_DATA;
        final float myData; //소문자 사용(권장하지않음)
*/
        /*
//
        int value1 = 3;

        {
            int value2 = 5;
            System.out.println(value1);
            System.out.println(value2);
        }//변수2가 사라지는 시점

            System.out.println(value1);
        //System.out.println(value2); // 오류
// 변수 1일 사라지는 시점*/

//        type casting
      /*  int value1 = (int)5.3;
        long value2 = (long)10;
        float value3 = (float) 5.8;
        double value4 = (double)16;

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println();

        long value5 = 10L;
        long value6 = 10l;
        float value7 = 5.8F;
        float value8 = 5.8f;

        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);
*/
    }
}