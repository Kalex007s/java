package StudyGroup.Study0502;

import java.util.Scanner;

//사용자로부터 사각형의 크기(가로와 세로)를 입력받아,
//그 크기만큼의 별(*)로 채워진 사각형을 그리는 프로그램을 작성하시오.
public class Example05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가로 길이를 입력하시오.");
        int intputWidth = scanner.nextInt();
        System.out.println("세로 길이를 입력하시오.");
        int intputLength = scanner.nextInt();
        for (int length = 0; length < intputLength; length++) {
            for (int width = 0; width < intputWidth; width++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
