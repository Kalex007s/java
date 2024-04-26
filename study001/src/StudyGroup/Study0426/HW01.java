package StudyGroup.Study0426;

import java.util.Scanner;

//유저가 숫자를 입력하면 그 숫자에 해당 하는 한글을 출력하는 코드를 작성하시오. 범위는 1부터 5까지이며 범위를 초과시 error 를 출력. ex) 유저 1 입력 = 일 출력
public class HW01 {
    public static void main(String[] args) {
        System.out.println("1부터 5까지의 숫자 중 하나를 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("일");
        } else if (input == 2) {
            System.out.println("이");
        } else if (input == 3) {
            System.out.println("삼");
        } else if (input == 4) {
            System.out.println("사");
        } else if (input == 5) {
            System.out.println("오");
        } else {
            System.out.println("error");
        }
    }
}
