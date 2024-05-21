package StudyGroup.Study0330;


//1. 변수 a,b,c,d,e,f의 초기값은
//a = 100, b = hello, c = 50.50, d = 나는 8살이야 , e = 99.999999, f = 180
//이며 출력시 a는 a와f의 합, b는 goodbye 가 출력되게 코드를 작성하시오.


public class HW01 {
    public static void main(String[]args){

        //첫번째 할 일 = 변수 선언
        int a = 100;
        String b = "hello";
        double c = 50.50; // 혹은 float c = 50.5 -> 소수점 첫번째 자리까지 표현하고 싶은 경우 float, 모두 표현하고 싶은 경우 double 자료형 사용
        String d  = "나는 8살이야";
        double e = 99.999999;
        int f = 180;

        //두번째 할 일 = 변수 안에 있는 값이 변경되었으므로 변경작업을 해준다.
        a = a+f;
        b = "goodbye";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

}
