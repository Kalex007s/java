package ExampleCode.Basic;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        /*
        //1~3까지 숫자중 내가 가지고 있는 숫자(임의로 정한)와 같은 번호를 찾는 코드
        int me = 2;
        if(me==1){
            System.out.println(1);
        }
        else if(me==2){
            System.out.println(2);
        }
        else if(me==3){
            System.out.println(3);
        }
        else{
            System.out.println("1~3까지의 숫자중 내가 고른 숫자는 없습니다");
        }
*/

        /*
        //1~10까지 숫자를 세는 코드를 만들어주세요.

        for(int i=0;i<10;i++){
            System.out.println(i+1);
        }
     */

        /*System.out.println("1부터 100까지의 숫자중 원하는 숫자를 입력하시오");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("입력하신 숫자는 "+num+" 입니다");
*/




        // 데이터베이스
        //1.김수중 2.윤별 3.홍성규 4.송진경 5.육승환
        // 안내문구 (학생의 학번을 입력해 주세요)
        //학생의 학번에 맞는 이름을 출려하세요.

        String [] arr = {"1.김수중","2.윤별","3.홍성규","4.송진경","5.육승환"};
        System.out.println("학생의 학번을 입력해 주세요");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i=1; i<arr.length; i++) {
            if (num==1){
                System.out.println("김수중");
                break;
            }
            if (num==2){
                System.out.println("윤별");
                break;
            }
            if (num==3){
                System.out.println("홍성규");
                break;
            }
            if (num==4){
                System.out.println("송진경");
                break;
            }
            if (num==5){
                System.out.println("육승환");
                break;
            }

        }






    }
}