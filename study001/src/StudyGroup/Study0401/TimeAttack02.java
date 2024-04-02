package StudyGroup.Study0401;
/*
사용자에게 1~10까지의 수 중 하나를 입력받는다.
(조건1. 입력받은 값이 1~10의 범위를 넘어간 경우 Error 출력)
사용자가 입력한 값을 userInput으로 받은 뒤
그 수가 짝수인 경우 입력 받은 수 부터 10까지의 숫자를 모두 더한 값을 출력하고,
또한 사용자가 입력한 값이 홀 수 인 경우
입력 받은 수부터 10까지의 숫자를 모두 곱한 값을 출력하고,
그 숫자가 홀수인지 짝수 인지 출력라는 코드를 짜시오.

(조건2. 계산 결과값이 20보다 클 경우)
삼항연산자
"결과값은 100보다 큰 수 입니다"
100일경우 100입니다를 출력하시오.
작을 경우 "결과값은 100보다 작은 수 입니다."
를 출력하시오.
 */

import java.util.Scanner;

public class TimeAttack02 {
    public static void main(String[] args) {
        int sum=0;
        int mul=1;
        System.out.println("1~10까지의 숫자중 하나를 입력하시오.");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if(userInput>=1 && 10>=userInput){
            if(userInput%2 == 0) {
                for(int i=userInput;i<=10;i++){
                    sum = sum+i;
                }
                System.out.println("입력하신 수는 [짝수]입니다.");
                System.out.println("입력하신 수부터 10까지의 수를 모두 더한 값은 : " + sum );
                String check = (sum>100) ? "결과값은 100보다 큰 수 입니다" : (sum==100) ? "결과값은 100입니다" : "결과값은 100보다 작은 수 입니다.";
                System.out.println(check);
            }
            else{
                for(int i =userInput;i<=10;i++){
                    mul = mul*i;
                }
                System.out.println("입력하신 수는 [홀수]입니다.");
                System.out.println("입력하신 수부터 10까지의 수를 모두 곱한 값은 : "+mul);
                String check = (mul>100) ? "결과값은 100보다 큰 수 입니다" : (mul==100) ? "결과값은 100입니다" : "결과값은 100보다 작은 수 입니다.";
                System.out.println(check);
            }
        }
        else {
            System.out.println("Error");
        }
    }
}
