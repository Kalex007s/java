package StudyGroup.Study0520;


import java.util.ArrayList;

//본 클래스는 홈페이지 메인 클래스.
/*
[ 구현해야할 항목 ]
1. 로그인 화면
2. 회원이라면 로그인, 회원이 아니라면 회원가입을 진행
단, 아이디는 회원명과 동일 / 비밀번호는 영문 + 숫자를 포함 4개 이상 입력
3. 로그인 성공시 어서오세요 00님 출력, 회원가입 시 가입을 축하합니다. 라고 리턴 후 새로운 회원의 정보 저장
[ 기존회원 명단 ]
id : alex || pw : a123
id : ben || pw : benKing00
id : tom || pw : 9999to99m
 */
public class Homepage {
    public static void main(String[] args) {
        //데이터 베이스 생성
        LoginSignup loginSignup = new LoginSignup();
        loginSignup.createUserInfoId();
        loginSignup.createUserInfoPw();
        //회원체크
        System.out.println("기존 회원이라면 [로그인], 신규 회원이라면 [회원가입]을 입력하시오.");


    }
}
