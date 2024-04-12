package StudyGroup.Study0411;
/*
[for문 사용]+if문 필요시 사용
1) 1~10까지의 숫자를 모두 출력하는 코드를 작성하시오.
2) 1~10까지의 숫자 중 짝수만 줄력하시오.
3) 1부터 50까지의 숫자 중 10의 배수만 출력하시오.
 */
public class HW02 {
    public static void main(String[] args) {
//        1) 1~10까지의 숫자를 모두 출력하는 코드를 작성하시오.
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1+" ");
        }
        System.out.println(); //줄바꿈
//        2) 1~10까지의 숫자 중 짝수만 줄력하시오.
        for (int i = 0; i <= 10; i=i+2) {
            System.out.print(i+" ");
        }
        System.out.println();
//        3) 1부터 50까지의 숫자 중 10의 배수만 출력하시오.
        for (int i = 10; i <= 50; i=i+10) {
            System.out.print(i+" ");
        }
    }
}
