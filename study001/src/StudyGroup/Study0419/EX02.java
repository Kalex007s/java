package StudyGroup.Study0419;

import java.util.Arrays;
import java.util.Scanner;

// 사용자에게 배열의 길이를 입력 받고
// 그 배열에 1부터 100까지 중 짝수의 숫자만 앞에서부터 넣으시오.
// 예 )) 길이가 3이면 배열 안에는 2,4,6저장된다.
public class EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 100까지의 숫자중 짝수만 들어있는 배열을 생성하려고 합니다.\n원하시는 배열의 길이를 입력하시오.");
        int lenth = scanner.nextInt();
        int [] array1 = new int[lenth];
        int array1Index = 0;
        for (int i = 1; i < 100; i++) {
            if(i % 2 ==0){
                array1[array1Index] = i;
                array1Index++;
            } if(array1Index == lenth){
                break;
            }
        }
        System.out.println("입력하신 배열의 길이는 "+array1Index+" 이며\n" +
                "배열에 저장되어 있는 숫자는 : "+ Arrays.toString(array1)+" 입니다.");
    }
}
