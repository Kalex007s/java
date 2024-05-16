package StudyGroup.Study0508;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        //복권 당첨 확인 프로그램 만들기
/*
프로그램에는 랜덤으로 생성되는 값 = 당첨 번호가 존재 하며(6개의 숫자),
유저가 값 6개를 입력한다.
조건.
(당첨 번호 끼리는 서로 값이 중복 되지 않아야 한다.)
1등 = 6개 모두 일치
2등 = 5개 일치
3등 = 4개 일치
나머지는 모두 꽝

//난수 생성법
Random rd = new Random();
        int randNum = rd.nextInt(10)+1; // 0 부터 입력한 (정수값-1) 범위에서 랜덤
 */
//1. 프로그램을 설계하시오.
//2. 코드를 작성하시오.

        //복권번호 생성하기
        Random randomNum = new Random();
        int[] lottoNum = new int[6];
        int check = 0;
        for (int i = 0; i < lottoNum.length; i++) {
            lottoNum[i] = randomNum.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lottoNum[i] == lottoNum[j]) {
                    System.out.println("중복된 숫자를 입력하셨습니다.");
                    i--;
                }
            }
        } //난수 6개를 복권번호 배열에 입력하였다.
        //1.로또번호 정렬.
        int[] set;
        set = lottoNum;
        for (int i = 0; i < set.length; i++) {
            for (int j = set.length - 1; j >= i; j--) {
                if (set[i] > set[j]) {
                    int pocket = set[j];
                    set[j] = set[i];
                    set[i] = pocket;
                }
            }
        }
        lottoNum = set;
        System.out.println(Arrays.toString(lottoNum));


        //유저번호 입력받기
        System.out.println("복권번호 입력받기");
        System.out.println();
        Scanner userInput = new Scanner(System.in);
        int[] userNum = new int[6];
        for (int i = 0; i < userNum.length; i++) {
            System.out.println("번호를 입력하시오.");
            userNum[i] = userInput.nextInt();
            //범위설정
            if (45 < userNum[i] || userNum[i] < 1) {
                System.out.println("숫자가 범위를 벗어났습니다.");
                i--;
            }
            //중복제거
            for (int j = 0; j < i; j++) {
                if (userNum[i] == userNum[j]) {
                    System.out.println("중복된 숫자를 입력하셨습니다.");
                    i--;
                }
            }
        } //유저가 고른 숫자 6개를 유저배열에 입력

        //2..유저번호 정렬.
        set = userNum;
        for (int i = 0; i < set.length; i++) {
            for (int j = set.length - 1; j >= i; j--) {
                if (set[i] > set[j]) {
                    int pocket = set[j];
                    set[j] = set[i];
                    set[i] = pocket;
                }
            }
        }
        userNum = set;
        System.out.println(Arrays.toString(userNum));

        //같은 숫자 세기
        for (int i = 0; i < lottoNum.length; i++) {
            for (int j = 0; j < userNum.length; j++) {
                if (lottoNum[i] == userNum[j]) {
                    check++;
                }
            }
        }
//        //당첨 찾기
//        if (check == 6) {
//            System.out.println("1등");
//        } else if (check == 5) {
//            System.out.println("2등");
//        } else if (check == 4) {
//            System.out.println("3등");
//        } else {
//            System.out.println("꽝");
//        }
        //등수확인
        int grade = 0;
        for (int i = 6; i >= 0; i--) {
            grade++;
            if (check == i) {
                if (i > 3) {
                    System.out.println(grade + "등 입니다");
                }
            }
        }
    }
}
