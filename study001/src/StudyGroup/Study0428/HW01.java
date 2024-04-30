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
        int totalKor = 0, totalMat = 0, totalSoi = 0, totalSic = 0, totalScore = 0;
        double avgKor, avgMat, avgSoi, avgSic;
        //다차원 배열 만들기
        Scanner scanner = new Scanner(System.in);
        int [][] gradeArray = new int[5][4];
        for (int i = 0; i < gradeArray.length; i++) {
            System.out.println( (i+1) +"번 학생의 점수를 국어,수학,사회,과학 순으로 입력해 주세요.");
            for (int j = 0; j < gradeArray[i].length; j++) {
                gradeArray[i][j] = scanner.nextInt();
            }
        }
        // 1번 : 각 과목별로 평균 점수를 구하시오.
        for (int i = 0; i < gradeArray.length; i++) {
            totalKor = totalKor + gradeArray[i][0];
            totalMat = totalMat + gradeArray[i][1];
            totalSoi = totalSoi + gradeArray[i][2];
            totalSic = totalSic + gradeArray[i][3];
        }
        avgKor = (double) totalKor / gradeArray.length;
        avgMat = (double) totalMat / gradeArray.length;
        avgSoi = (double) totalSoi / gradeArray.length;
        avgSic = (double) totalSic / gradeArray.length;

        System.out.println("국어 평균 : " + avgKor);
        System.out.println("수학 평균 : " + avgMat);
        System.out.println("사회 평균 : " + avgSoi);
        System.out.println("과학 평균 : " + avgSic);
        // 2번 : 반의 전체 평균을 구하시오.
        for (int i = 0; i < gradeArray.length; i++) {
            for (int j = 0; j < gradeArray[i].length; j++) {
                totalScore = totalScore + gradeArray[i][j];
            }
        }
        // 3번 : 학생 5명에 대한 국어 평균 이상 이하 학생을 구분하시오.
        for (int i = 0; i < gradeArray.length; i++) {
            if (gradeArray[i][0] > avgKor){
                System.out.println( i + "번째 학생의 국어 점수는 평균 이상입니다.");
            } else {
                System.out.println( i + "번째 학생의 국어 점수는 평균 이하입니다.");
            }
        }
        // 4번 : 모든 학생의 각 과목별 총점을 담고 있는 객체를 출력하시오.
        int [] totalScoreBySubject = new int[]{totalKor,totalMat,totalSoi,totalSic};
        System.out.println("A반 학생들의 과목별 총점 : " + Arrays.toString(totalScoreBySubject));
    }
}
