import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelfLotto {
    public static void main(String[] args) {




        //안내문
        System.out.println("행운복권에 오신 걸 환영합니다!\n저희 행운복권의 당첨 기준은 당첨번호와 고객님의 번호가\n" +
                "6개 모두 일치한다면 1등!\n5개가 일치한다면 2등\n4개가 일치한다면 3등\n그외 3,2,1개가 일치한다면 '꽝'입니다.\n" +
                "당첨 기준을 확인하셨다면 6개의 숫자를 입력해 행운의 주인공이 되어보세요!!\n" +
                "단, 숫자의 순서는 당첨에 영향을 주는 요소가 아니며 숫자는 중복될 수 없습니다.\n");

        //유저의 값을 입력 받는 코드

        int[] userNumber = new int[6];

        for (int i = 0; i < userNumber.length; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println(i + 1 + "번 번호를 입력하시오.");
            userNumber[i] = sc.nextInt();


            //유저가 입력한 값과 중복되는 값이 있는지 확인하는 코드
            for (int j = 0; j < i; j++) {
                if (userNumber[j] == userNumber[i]) {
                    System.out.println("입력하신 숫자는 이전 숫자와 중복되는 숫자입니다.\n" +
                            "다시 입력해주세요");
                    i = i - 1;
                    //if문으로 확인하는 코드 만들기
                    break;
                }
            }
        }
        Arrays.sort(userNumber);
        System.out.println("입력하신 숫자는 " + Arrays.toString(userNumber) + "입니다.\n추첨을 시작합니다.");


       /*
       //5초 딜레이 주는 코드
        try {
            Thread.sleep(5000); // 밀리초 단위로 지정 (5초 = 5000 밀리초)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */


        //당첨번호 만들기
        int[] intList = new int[6];
        Random rd = new Random();
        for (int i = 0; i < 6; i++) {
            intList[i] = rd.nextInt(45) + 1;
        }
        int count = 6;
        while (count > 0) {
            count = 6;
            Arrays.sort(intList);
            for (int i = 0; i < intList.length; i++) {
                if (i < intList.length - 1 && intList[i] == intList[i + 1]) {
                    intList[i + 1] = rd.nextInt(45) + 1;
                } else {
                    count--;
                }
            }
        }
        System.out.println("당첨번호는 " + Arrays.toString(intList) + "입니다.");


        //유저가 입력한 값과 당첨번호를 비교하는 코드
        int countDouble = 0;
        if (userNumber == intList) {
            System.out.println("축하합니다! 1등 당첨되셨습니다!!!");
            //break; 를 걸어야하나..
        } else
            for (int i = 0; i < userNumber.length; i++) {
                for (int j = 0; j < userNumber.length; j++) {
                    if (userNumber[i] == intList[j]) {
                        countDouble = countDouble + 1;
                    }
                }
            }
        switch (countDouble) {
            case (0), (1), (2), (3):
                System.out.println("일치한 번호의 갯수는 " + countDouble + "개로 [꽝]입니다.");
                break;
            case (4):
                System.out.println("일치한 번호의 갯수는 " + countDouble + "개로 3등 [당첨]입니다!");
                break;
            case (5):
                System.out.println("일치한 번호의 갯수는 " + countDouble + "개로 2등 [당첨]입니다.");
                break;
        }
    }
}

//숫자정렬이 안되고 45 넘는 숫자를 받았을때 실행이 되지 않아야 하는데 된다....
//하지만 난 너무 졸리다
//지금시간 3시반...
//자야한다..
//아마 로또 번호 받는쪽과 만드는 쪽에 if문/for문을 써서 돌려야 할 거 같은데 아 몰라 난 잘거다
