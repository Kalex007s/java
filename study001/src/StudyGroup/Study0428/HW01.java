package StudyGroup.Study0428;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

//각 학생 5명의 국어 수학 사회 과학 점수 배열이 있다. [임의로 값 입력]
//1. 각 과목별로 평균 점수를 구하시오.
//2. 반의 전체 평균을 구하시오.
//3. 학생 5명에 대한 국어 평균 이상 이하 학생을 구분하시오.
//4. 모든 학생의 각 과목별 총점을 담고 있는 객체를 출력하시오.
public class HW01 {
    public static void main(String[] args) {
        int totalKor = 0;
        int totalMat = 0;
        int totalSoi = 0;
        int totalSic = 0;

        //1. + 2.
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생들의 국어점수를 입력하시오.");
        int[] kor = new int[5];
        for (int i = 0; i < 5; i++) {
            kor[i] = scanner.nextInt();
            totalKor = totalKor + kor[i];
        }

        System.out.println("학생들의 수학점수를 입력하시오.");
        int[] mat = new int[5];
        for (int i = 0; i < 5; i++) {
            mat[i] = scanner.nextInt();
            totalMat = totalMat + mat[i];
        }

        System.out.println("학생들의 사회점수를 입력하시오.");
        int[] soi = new int[5];
        for (int i = 0; i < 5; i++) {
            soi[i] = scanner.nextInt();
            totalSoi = totalSoi + soi[i];
        }

        System.out.println("학생들의 과학점수를 입력하시오.");
        int[] sic = new int[5];
        for (int i = 0; i < 5; i++) {
            sic[i] = scanner.nextInt();
            totalSic = totalSic + sic[i];
        }

        System.out.println("국어 평균 : " + (totalKor/5) + (totalKor%5));
        System.out.println("수학 평균 : " + (totalMat/5) + (totalMat%5));
        System.out.println("사회 평균 : " + (totalSoi/5) + (totalSoi%5));
        System.out.println("과학 평균 : " + (totalSic/5) + (totalSic%5));
        //3.
        int totalScore = (totalKor + totalMat + totalSic + totalSoi) /5;
        System.out.println("반 전체 평균 : "+ totalScore);
        //4.
        for (int i = 0; i < kor.length; i++) {
            if (kor[i] >= totalKor){
                System.out.println(i+"번 학생은 평균 [이상]입니다.");
            }else {
                System.out.println(i+"번 학생은 평균 [이하]입니다.");
            }
        }
        int [] totalScoreByClass = new int[4];
        totalScoreByClass[0] = totalKor;
        totalScoreByClass[1] = totalMat;
        totalScoreByClass[2] = totalSoi;
        totalScoreByClass[3] = totalSic;

        System.out.println("과목 별 총점 : " + Arrays.toString(totalScoreByClass));
    }
}