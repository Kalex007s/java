package StudyGroup.Study0514;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        //구구단 어플을 만드시오.
        //사용자가 원하는 단수를 입력하면 그에 해당하는 구구단이 출력되야함
        //단, 외부 클래스 사용
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        Numbers numbers = new Numbers();
        System.out.println(numbers.toMakeTimesTable(userInput));
    }
}
