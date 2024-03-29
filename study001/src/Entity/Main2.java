
package Entity;

public class Main2 {
        public static void main(String[]args){
                InfoCreat.createInfo();
                //2번 수강ID로 수강하고 있는 유저ID 찾기
                Method Method = new Method();
                Method.searchingUserIdBySujectId();
                //3번 유저의 loginId로 강의명 찾기
                Method.searchingSubjectNameByUserId();
                //4번 강의명으로 수강생들의 이메일 찾기
                Method.searchingUserEmailBySujectName();

    }
}

