package HomeWork.HW02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        // 사용자로부터 문자열 5개를 입력받아 컬렉션 구현체에 저장하고
        // 저장된 문자열들을 화면에 출력하시오.
        // 단, 중복 문자열은 저장하지 말아야 함
        Set<String> hSet1 = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println((i+1)+"번째 문자열을 입력하시오");
            String in = scanner.nextLine();
            hSet1.add(in);
        }
        System.out.println(hSet1.toString());
    }
}
