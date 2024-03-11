import java.util.Arrays;
import java.util.Scanner;

public class SelfTestSpace {
    public static void main(String[] args) {

        //양의정수 10개를 입력
        //배열에 담는다
        //3의 배수만 입력

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int[] arrattrue = new int[10];


        System.out.println("양에 정수 10개를 입력해주세요");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " 번째 숫자를 입력하시오.");
            array[i] = sc.nextInt();
            if (array[i] < 0) {
                System.out.println("입력받은 값이 양의 정수가 아니므로 다시 입력해주세요.");
                i = i - 1;
            }
        }
        //3의 배tn인지 확인
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 3 == 0) {
                arrattrue[j] = array[j];
            }
            System.out.print(arrattrue[j] + " ");
        }
    }
}

