package StudyGroup.Study0516.Example;

import java.util.Scanner;

public class Memo {
    public static void main(String[] args) {
        //유저에게 두 수를 입력 받아서 더하는 코드를 작성하시오.
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int lastNum = scanner.nextInt();

        Number number = new Number();
        number.plusTwoNum(firstNum,lastNum);
        number.minusTwoNum(firstNum,lastNum);

    }
}
