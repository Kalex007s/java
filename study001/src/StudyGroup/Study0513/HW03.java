package StudyGroup.Study0513;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        //계산기 구현
        //사용자로부터 두 개의 숫자와 연산자(+, -, *, /)를 입력받아 해당 연산을 수행하는 코드를 작성하시오.
        //조건. 4가지의 연산자가 아닌 경우 다시 입력받도록 설계, 프로그램의 종료는 사용자가 '종료'라고 입력해야지만 가능하도록 코드를 작성

        Calculator calculator = new Calculator();
        double result = calculator.calculator();
        System.out.println(result);
    }
}
