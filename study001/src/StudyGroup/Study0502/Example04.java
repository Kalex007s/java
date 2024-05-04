package StudyGroup.Study0502;

import java.util.Random;
import java.util.Scanner;

//[숫자 맞추기 게임]
//사용자에게 랜덤한 숫자를 맞추게 하는 간단한 숫자 맞추기 게임 코드를 작성하시오.
// 출력 할 것 : 1. 시도한 횟수, 2. 맞춘 숫자
public class Example04 {
    public static void main(String[] args) {
        // 1부터 100까지 랜덤한 숫자 생성
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        //이후부터 코드 작성
        Scanner scanner = new Scanner(System.in);
        int count, answer;
        System.out.println("숫자 맞추기 게임 : 숫자를 입력하시오.");
        for (count = 1; ;count++) {
            int input = scanner.nextInt();
            if (input == randomNumber){
                answer = input;
                System.out.println("정답입니다!");
                break;
            } else if (input > randomNumber){
                System.out.println("오답입니다. 입력하셨던 숫자보다 작은 수를 입력해주세요");
            } else {
                System.out.println("오답입니다. 입력하셨던 숫자보다 큰 수를 입력해주세요");
            }
        }
        System.out.println("시도 횟수 : " + count + "\n정답숫자 : " + answer);
    }
}
