
package Entity;

import Entity.Enum.CategoryRating;
import Entity.Enum.CategorySubjectId;

public class Main2 {
        public static void main(String[]args){
                //정보 가져오기
                InfoCreat.createInfo();

                //2번 수강ID로 수강하고 있는 유저ID 찾기
                Method Method = new Method();
                Method.searchingUserIdBySujectId();
                //3번 유저의 loginId로 강의명 찾기
                Method.searchingSubjectNameByUserId();
                //4번 강의명으로 수강생들의 이메일 찾기
                Method.searchingUserEmailBySujectName();
                //리뷰 생성
                Method.createReview("K123", CategorySubjectId.KOR1,CategoryRating.STAR10,"좋은 강의였어요");
                //1.특정 과목ID로 해당 과목을 가르치는 teacher의 이름 출력
                Method.getTeacherBySubjectId(CategorySubjectId.KOR1);
                //2.특정 teacher가 가르치는 과목명 리스트 출력
                Method.getSubjectListByTeacherId("TeacherNo01");


        }
}

