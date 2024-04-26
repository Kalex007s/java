package StudyGroup.Study0426;
// 다음 출력이 되는 코드를 작성 하시오.
/*
초등학생
1학년 = 8살
2학년 = 9살
3학년 = 10살
4학년 = 11살
5학년 = 12살
6학년 = 13살
중학생
1학년 = 14살
2학년 = 15살
3학년 = 16살
고등학생
1학년 = 17살
2학년 = 18살
3학년 = 19살
 */

public class HW02 {
    public static void main(String[] args) {
        int startAge = 8;
        int i;
        System.out.println("초등학생");
        for (i = 0; i < 6 ; i++) {
            int grade = i+1;
            System.out.println(grade+"학년 = " + startAge + "살");
            startAge++;
        }
        System.out.println("중학생");
        for (i = 0; i < 3; i++) {
            int grade = i+1;
            System.out.println(grade+"학년 = " + startAge + "살");
            startAge++;
        }
        System.out.println("고등학생");
        for (i = 0; i < 3; i++) {
            int grade = i+1;
            System.out.println(grade + "학년 = " + startAge + "살");
            startAge++;
        }
    }
}
