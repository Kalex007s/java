package StudyGroup.Study0419;

import java.util.Arrays;
import java.util.Scanner;

//사용자가 입력한 정수 배열을 오른쪽으로 주어진 횟수만큼 회전시키는 프로그램을 작성하시오.
//예를 들어, 배열 [1, 2, 3, 4, 5]를 오른쪽으로 2회 회전하면 [4, 5, 1, 2, 3]이 된다.
public class EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("만들고자 하는 정수 배열의 길이를 입력하시오.");
        int length = scanner.nextInt();
        int [] array1 = new int[length];
        System.out.println("길이가 "+array1.length+" 인 배열에 들어가 수들을 입력하시오.");
        for (int i = 0; i < array1.length; i++) {
            int input = scanner.nextInt();
            array1[i] = input;
        }
        System.out.println("입력하신 숫자들은 "+ Arrays.toString(array1)+"입니다."
                + "입력하신 숫자들을 어느 방향으로 회전 시킬지 입력하시오 = 오른쪽 or 왼쪽");
        String wayRight = "오른쪽";
        String wayLeft = "왼쪽";
        Scanner scanner1 =new Scanner(System.in);
        String inputWay = scanner1.nextLine();
        System.out.println("회전 횟수를 입력하시오.");
        int count = scanner.nextInt();
        if (wayRight.equals(inputWay)){
            for (int i = 0; i < count; i++) {
                int temp = array1[array1.length-1];
                for(int j = array1.length-1; j>0; j--){
                    array1[j] = array1[j-1];
                } array1[0] = temp;
            }
            System.out.println("결과값 : "+Arrays.toString(array1));
        } else if (wayLeft.equals(inputWay)) {
            for (int i = 0; i < count; i++) {
                int temp = array1[0];
                for (int j = 0; j < array1.length-1; j++) {
                    array1[j] = array1[j+1];
                } array1[array1.length-1] = temp;
            }
            System.out.println("결과값 : "+Arrays.toString(array1));
        }else {
            System.out.println("잘못된 입력입니다.\n프로그램을 종료합니다.");
        }
    }
}
