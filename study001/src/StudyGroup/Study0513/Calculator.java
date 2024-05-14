package StudyGroup.Study0513;

import java.util.Scanner;

public class Calculator {
    public double calculator() {
        double result = 0;
        for (int i = 1; i < 2; i++) {
            //연산자 입력
            Scanner scanner = new Scanner(System.in);
            System.out.println("연산자를 입력하시오.");
            String inputCalculator = scanner.nextLine();
            //종료키워드
            if (inputCalculator.equalsIgnoreCase("종료")) {
                return result;
            } else {
                //연산자를 제대로 입력했는지 확인
                if (inputCalculator.equalsIgnoreCase("+")|| inputCalculator.equalsIgnoreCase("-")
                        || inputCalculator.equalsIgnoreCase("*") || inputCalculator.equalsIgnoreCase("/")) {
                    //제대로 된 연산자인 경우 숫자 입력받기
                    System.out.println("첫번째 수를 입력하시오.");
                    double first = scanner.nextDouble();
                    System.out.println("두번째 수를 입력하시오.");
                    double last = scanner.nextDouble();
                    //연산자 찾기
                    switch (inputCalculator) {
                        case "+":
                            result = first + last;
                            break;
                        case "-":
                            result = first - last;
                            break;
                        case "*":
                            result = first * last;
                            break;
                        case "/":
                            result = first / last;
                            break;
                    }
                }
                //오류시 예외처리
                else {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요. 종료를 원하시면 [종료[를 입력하시오");
                    i--;
                }
            }
        }
        return result;
    }
}
