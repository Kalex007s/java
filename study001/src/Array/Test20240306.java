package Array;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Test20240306 {
    public static void main(String[] args) {
        //1. 길이가 10인 배열에 1부터 10까지 값을 입력
        int[] intList1 = new int[10];
        for (int i = 0; i < 10; i++) {
            intList1[i] = i + 1;
        }
        System.out.println(Arrays.toString(intList1));

        /* 기본타입
        int [] 이름 = new 타입[길이];
        for (int i=0; i<ㅣlenth; i++){
              배열[i] = ;
        */

        //2. 길이가 10인 배열에 1부터 10까지 값을 거꾸로 입력
        int[] intList2 = new int[10];
        int len = intList2.length;
        for (int i = 0; i < intList2.length; i++) {
            intList2[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(intList2));

        String[] fruiList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
        int count = 0;
        for (int i = 0; i < fruiList.length; i++) {
            if (fruiList[i] == "사과") {
                count = count + 1;
            }
        }
        System.out.println(count);

        /*

        // 자바에서 입력값을 받는 법
        Scanner scanner = new Scanner(System.in); // 입력받기 위해 in을 받는것
        System.out.print("0~6까지 숫자를 입력해 주세요 : ");
        int inputNumber = scanner.nextInt(); //.nextInt() = 입력값이 입력될 때까지 프로그램을 중단 시키고 기다림.
        if(inputNumber >= 0 && inputNumber>=6) {
            System.out.println("당신이 입력한 값은 범위를 벗어났습니다.\n다시 입력해주십시오");
        }
        else
            System.out.println("당신이 입력한 숫자는"+inputNumber+" 입니다.");

        // 자바에서 문자열을 입력 받는 방법
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해 주세요");
        String inputName = sc.nextLine();
        System.out.println(inputName);



        // 4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일에 출력
        char[] week = {'월','화','수','목','금','토','일'};
        Scanner scanner = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해 주세요 : ");
        int num = scanner.nextInt();
        for(int i=0; i< week.length; i++){
            if (num>= 0 && num<= 6) {
                System.out.println(week[num]);
                break;
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
*/

        //5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        //"~~님 환영합니다"를 출력하고
        //없으면 "회원가입 해주세요"를 출력 (단, 대소문자 구분하지 마시오)
        String[] numbers = {"Steve", "Tom", "Micheal", "Luna", "Jessica", "Annie"};
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해 주세요");
        String strName = sc.nextLine();
        boolean found = false;
        for(int i=0; i< numbers.length; i++){
            if(numbers[i].equalsIgnoreCase(strName)){
                System.out.println(numbers[i] + "님 환영합니다.");
                found = false;
                break;
            }
        }
        if(!found) {
            System.out.println("회원가입해주세요");
        }
        /*
        boolean b = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equalsIgnoreCase(strName)) {
                System.out.println(numbers[i] + "님 환영합니다");
                b = true;
                break;
            }
        }
        if (b == false) {
            System.out.println("회원가입을 해주세요");
        }
        */
    }
}


