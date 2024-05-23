package HomeWork.HW01;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // 변수 num을 유저로부터 입력받아서 양수, 음수, 0 을 구별하는 코드를
        // 작성하시오. 단, if조건문이 아닌 삼항연산자를 사용해야함.
        /* 결과 예시
            입력값이 10이면 "양수" 출력
            입력값이 0이면 "0" 출력
            입력값이 -10이면 "음수" 출력 * */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String thr = (num==10) ? "양수" : (num==0) ? "0" : (num==-10) ? "음수" : "입력하신 값을 표현할 수 없습니다";
        System.out.println(thr);



    }
}