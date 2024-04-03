package StudyGroup.Study0402;


//사칙연산 계산기 코드를 작성하시오.
//조건 1.) 사용자에게 2개의 숫자를 입력 받는다.
// 사용자가 원하는 사칙연산의 숫자를 입력받는다. ex. 1. 덧셈 2. 뺄셈 3. 곱셈 4.나눗셈 중 원하는 연산의 숫자를 입력하시오.
//조건 2.) 사용자가 원하는 사칙연산을 수행하는 코드를 작성한다.
//조건 3.) 범위를 벗어나는 행동을 할 경우 Error를 출력한다.

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {

        //숫자를 입력받는다.
        System.out.println("첫번째 숫자를 입력하시오.");
        Scanner sc1 = new Scanner(System.in);
        int first = sc1.nextInt();
        System.out.println("두번째 숫자를 입력하시오.");
        Scanner sc2 = new Scanner(System.in);
        int last = sc2.nextInt();

        //유저가 원하는 사칙연산을 입력받는다.
        System.out.println("다음 사칙연산 중 하나의 숫자를 입력하시오.\n1.덧셈, 2.뺄셈, 3.곱셈, 4.나눗셈");
        Scanner sc3 = new Scanner(System.in);
        int choose = sc3.nextInt();

        //유저가 입력한 값이 범위 안에 있는지 확인 후 사칙연산 계산기와 유저가 선택한 연산을 이어준다.
        //핗요한 변수 선언 *변수선언시 항상 위치 잘 생각하고 선정*
        int sum;
        int minus;
        int multiplication;
        float division;
        if (0<choose && choose<5) {
            switch (choose) {
                case (1):
                    sum = first+last;
                    System.out.println("결과 값은 : "+sum);
                    break;
                case (2):
                    minus = first-last;
                    System.out.println("결과 값은 : "+minus);
                    break;
                case (3):
                    multiplication = first*last;
                    System.out.println("결과 값은 : "+multiplication);
                    break;
                case (4):
                    division = first/last;
                    System.out.println("결과 값은 : "+division);
                    break;
            }
        }
        else {
            System.out.println("Error : out of bounds.");
        }
    }
}
