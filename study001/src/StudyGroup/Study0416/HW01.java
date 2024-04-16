package StudyGroup.Study0416;

import java.util.Scanner;

/*
스무고개 코드를 작성하고 질문의 답을 했을때 후보와 일치 하는지 확인하시오.
질문지
1. 당신의 키는 160cm 이상입니까?
2. 당신은 검은색 머리입니까?
3. 당신은 이성친구가 있습니까?
4. 당신의 나이는 12살보다 많습니까?
5. 당신은 반바지를 입었습니까?
후보 인포)
철수 161cm 검은머리 여자친구0 18살 반팔 반바지
짱구 173cm 검은머리 여자친구X 19살 반팔 긴바지
 */
public class HW01 {
    public static void main(String[] args) {
        System.out.println("환영합니다.\n다음 5가지 질문에 예 혹은 아니오로 답변해 주십시오.");
        Scanner scanner = new Scanner(System.in); // 객체 -> heap
        System.out.println("당신의 키는 160cm 이상입니까?");
        String sc1 = scanner.nextLine();
        System.out.println("당신은 검은색 머리입니까?");
        String sc2 = scanner.nextLine();
        System.out.println("당신은 이성친구가 있습니까?");
        String sc3 = scanner.nextLine();
        System.out.println("당신의 나이는 12살보다 많습니까?");
        String sc4 = scanner.nextLine();
        System.out.println("당신은 반바지를 입었습니까?");
        String sc5 = scanner.nextLine();

        if (sc1.equals("예")) {
            if (sc2.equals("예")) {
                if (sc3.equals("예")) {
                    if (sc4.equals("예")) {
                        if (sc5.equals("예")) {
                            System.out.println("당신의 이름은 [철수] 입니다.");
                        }
                    }
                } else {
                    if (sc4.equals("예")) {
                        if (sc5.equals("아니오")) {
                            System.out.println("당신의 이름은 [짱구] 입니다.");
                        }
                    }
                }
            }
        }
    }
}
