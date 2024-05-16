package StudyGroup.Study0514;

import java.util.Scanner;


public class HW01 {
    public static void main(String[] args) {
        //사용자가 값을 입력하면 짝수인지 홀수인지를 구분하는 코드를 작성하시오.
        //단, 외부클래스 사용.

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        Numbers numbers = new Numbers();
        String result = numbers.toDivisionEvenOrOdd(userInput);
        System.out.println(result);
    }
}
