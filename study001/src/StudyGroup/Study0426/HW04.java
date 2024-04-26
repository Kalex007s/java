package StudyGroup.Study0426;

import java.util.Scanner;

// 유저에게 나이를 입력 받고,
// 나이에 맞는 학년을 출력하시오.
/*
초등학생
1학년 = 8살
2학년 = 9살
3학년 = 10살
4학년 = 11살
5학년 = 12살
6학년 = 13살
중학생
1학년 = 14살
2학년 = 15살
3학년 = 16살
고등학생
1학년 = 17살
2학년 = 18살
3학년 = 19살

20살부터는 모두 성인으로 출력
 */
public class HW04 {
    public static void main(String[] args) {
        System.out.println("나이를 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 8 && age < 14) {
            int startAge = 8;
            for (int i = 0; ; i++) {
                int grade = i + 1;
                if (startAge == age) {
                    System.out.println("초등학생" + grade + "학년");
                    break;
                }
                startAge++;
            }
        } else if (age >= 14 && age < 17) {
            int startAge = 14;
            for (int i = 0; ; i++) {
                int grade = i + 1;
                if (startAge == age) {
                    System.out.println("중학생" + grade + "학년");
                    break;
                }
                startAge++;
            }
        } else if (age >= 17 && age < 20) {
            int startAge = 17;
            for (int i = 0; ; i++) {
                int grade = i + 1;
                if (startAge == age) {
                    System.out.println("고등학생" + grade + "학년");
                    break;
                }
                startAge++;
            }
        } else {
            System.out.println("error");
        }
    }
}