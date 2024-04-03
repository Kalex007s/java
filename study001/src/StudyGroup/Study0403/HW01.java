package StudyGroup.Study0403;


//(본인 이름) 학생의 국어점수는 100점, 수학점수는 40점, 영어점수는 60점이다.
//(본인 이름) 학생의 총점은 (연산하시오.)이다.
//(본인 이름) 학생의 평균은 (연산하시오.)이다.
public class HW01 {
    public static void main(String[] args) {
        int kor = 100;
        int mat = 40;
        int eng = 60;
        int sum = kor+mat+eng;
        float evg = sum/3;

        System.out.println("김수중 학생의 국어점수는 "+kor+"점, 수학점수는 "+mat+"점, 영어점수는 "+eng+"점이다.");
        System.out.println("김수중 학생의 총점은 "+sum+"점 이다.");
        System.out.println("김수중 학생의 평균은 "+evg+"점 이다.");
    }
}
