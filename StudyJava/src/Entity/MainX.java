/*
package Entity;

import JavaInterface.A;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //System.out.println("유저 및 학과정보");

        Scanner scanner = new Scanner(System.in);


       User user1 = new User("돌쇠", "K123", LocalDate.of(1999, 2, 4),
                "010-8888-5555", 26, "kk@naver.com", "남");
        //System.out.println(user1.toString());
        User user2 = new User("마당쇠", "K456", LocalDate.of(1997, 3, 25),
                "010-0000-1111", 28, "mm@naver.com", "남");
        //System.out.println(user2.toString());
        User user3 = new User("춘향", "K987", LocalDate.of(2000, 8, 16),
                "010-1234-0000", 25, "chch@naver.com", "여");
        //System.out.println(user3.toString());
        User user4 = new User("신데렐라", "K654", LocalDate.of(2002, 6, 7),
                "010-0808-0202", 23, "ss@naver.com", "여");
        //System.out.println(user4.toString());
        //System.out.println();

        Subject kor = new Subject("국어", 1, 30, "상급", "서울");
        //System.out.println(kor.toString());
        Subject mat = new Subject("수학", 2, 10, "하급", "대전");
        //System.out.println(mat.toString());
        Subject sct = new Subject("사회", 3, 10, "중급", "부산");
        //System.out.println(sct.toString());
        Subject sic = new Subject("과학", 4, 10, "중급", "서울");
        //System.out.println(sic.toString());
        //System.out.println();

        ArrayList<SubjectRegistration> subjectRegistrations = new ArrayList<>();
        SubjectRegistration subjectRegistration1 = new SubjectRegistration("K123", 1);
        subjectRegistrations.add(subjectRegistration1);
        SubjectRegistration subjectRegistration2 = new SubjectRegistration("K456", 2);
        subjectRegistrations.add(subjectRegistration2);
        SubjectRegistration subjectRegistration3 = new SubjectRegistration("K987", 2);
        subjectRegistrations.add(subjectRegistration3);
        SubjectRegistration subjectRegistration4 = new SubjectRegistration("K654", 4);
        subjectRegistrations.add(subjectRegistration4);

        //2번 수강ID로 수강하고 있는 유저ID 찾기


        System.out.println("찾고자 하는 과목의 과목아이디를 입력하시오.");
        int sujectIdIn = scanner.nextInt();
        int count = 0;
        ArrayList<String> arrayListID = new ArrayList<>();
        for (int i = 0; i < subjectRegistrations.size(); i++) {
            if (subjectRegistrations.get(i).getSubjectId() == sujectIdIn) {
                count++;
                arrayListID.add(subjectRegistrations.get(i).getUserId());
            }
        }
        System.out.println("과목 아이디(" + (sujectIdIn) + ")을 수강 하는 학생 수는 " + count + "이며 수강생의 ID는 " + arrayListID + " 입니다.");


        ArrayList<User> usersInfo = new ArrayList<>();
        //for(int i=0;i<subjectRegistrations.size())usersInfo.add(user1);
        usersInfo.add(user1);
        usersInfo.add(user2);
        usersInfo.add(user3);
        usersInfo.add(user4);
        //System.out.println(usersInfo);
        //System.out.println();
        ArrayList<Subject> subjectInfo = new ArrayList<>();
        subjectInfo.add(kor);
        subjectInfo.add(mat);
        subjectInfo.add(sic);
        subjectInfo.add(sct);

        //3번 유저의 loginId로 강의명 찾기
        scanner.nextLine();  // 행을 바꾸면서 가비지데이터를 날려야한다
        System.out.println("수강생 ID를 입력하시오.");
        String userIdIn = scanner.nextLine();
        for (int i = 0; i < subjectRegistrations.size(); i++) {
            if (subjectRegistrations.get(i).getUserId().equalsIgnoreCase(userIdIn)) {
                for (int j = 0; j < subjectInfo.size(); j++) {
                    if (subjectRegistrations.get(i).getSubjectId() == (subjectInfo.get(j).getSubjectID())) {
                        System.out.println(userIdIn + " ID의 수강생이 수강하고 있는 과목은 "
                                + subjectInfo.get(j).getSubjectName() + "입니다.");
                    }
                }
            }
        }
        //4번 강의명으로 수강생들의 이메일 찾기
        System.out.println("강의명을 입력하시오.");
        String subjectName = scanner.nextLine();
        for(int i=0;i<subjectInfo.size();i++){
            if(subjectName.equalsIgnoreCase(subjectInfo.get(i).getSubjectName())){
                for(int j=0;j<subjectRegistrations.size();j++)
                    if(subjectRegistrations.get(j).getSubjectId()==subjectInfo.get(i).getSubjectID()){
                        for(int k=0;k<usersInfo.size();k++){
                            if(usersInfo.get(k).getUserID().equalsIgnoreCase(subjectRegistrations.get(j).getUserId())){
                                System.out.println(subjectName+"을 수강하는 수강생들의 이메일은 "
                                        +usersInfo.get(k).getEmailAddress()+" 입니다");
                            }
                        }
                    }
            }
        }

    }
}
 //System.out.println("과목 아이디"+(2)+"을 수강 하는 학생의 수는 "
 //       +subjectRegistrations.get(i).getSubjectId()+"명이며 "+
 //       "수강생의 ID는 "+subjectRegistrations.get(i).getUserId()+" 입니다.");*/
