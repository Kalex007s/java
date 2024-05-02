package StudyGroup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner를 사용하여 사용자 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요: ");

        // 사용자로부터 문자열 입력을 받습니다.
        String input = scanner.nextLine();

        // 입력 받은 문자열을 단어 배열로 분리합니다.
        // 공백으로 문자열을 분리하여 단어 배열을 만듭니다.
        String[] words = input.split(" ");

        // 단어 배열을 역순으로 출력합니다.
        System.out.println("역순으로 출력된 단어:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }

        // Scanner를 닫습니다.
        scanner.close();
    }
}