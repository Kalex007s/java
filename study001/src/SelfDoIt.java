import java.util.Scanner;

public class SelfDoIt {
    public static void main(String[] args) {
        System.out.println("이 프로그램은 당신의 중간고사 평균을 구해주는 프로그램입니다\n먼저 당신의 국어 점수를 입력하시오");

        Scanner scanner = new Scanner(System.in);
        int kor = scanner.nextInt();
        System.out.println("다음은 영어 점수를 입력하시오");
        int egl = scanner.nextInt();
        System.out.println("다음은 수학 점수를 입력하시오");
        int mat = scanner.nextInt();
        System.out.println("다음은 사회 점수를 입력하시오");
        int sct = scanner.nextInt();

        int total = (kor + egl + mat + sct);
        float evg = (total/4);
        System.out.println("당신의 국.영.수.사 과목의 총점은"+ total+"이며\n4과목 평균값은" + evg + "입니다");









    }
}
