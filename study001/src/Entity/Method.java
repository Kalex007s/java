package Entity;

import Entity.Enum.CategorySubject;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {

    //1.과목 아이디 찾기
    public void searchingUserIdBySujectId() {
        System.out.println("찾고자 하는 과목의 과목아이디를 입력하시오.");
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        String sujectIdIn = String.valueOf(sc);

        ArrayList<String> arrayListID = new ArrayList<>();
        for (int i = 0; i < InfoCreat.subjectRegistrations.size(); i++) {
            if (InfoCreat.subjectRegistrations.get(i).getSubjectId() == sujectIdIn) {
                arrayListID.add(InfoCreat.subjectRegistrations.get(i).getUserId());
                count++;
            }
        }
        System.out.println("과목 아이디(" + (sujectIdIn) + ")을 수강 하는 학생 수는 총 "
                + count + "이며 수강생의 ID는 " + arrayListID + " 입니다.");
    }

    //2.수강생 ID로 과목명 찾기
    public void searchingSubjectNameByUserId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("수강생 ID를 입력하시오.");
        int count = 0;
        String userIdIn = scanner.nextLine();
        ArrayList<CategorySubject> arrayListCategorySubject = new ArrayList<>();
        for (int i = 0; i < InfoCreat.subjectRegistrations.size(); i++) {
            if (InfoCreat.subjectRegistrations.get(i).getUserId().equalsIgnoreCase(userIdIn)) {
                for (int j = 0; j < InfoCreat.subjects.size(); j++) {
                    if (InfoCreat.subjectRegistrations.get(i).getSubjectId().equalsIgnoreCase(InfoCreat.subjects.get(j).getCategorySubjectId().toString())){
                        arrayListCategorySubject.add(InfoCreat.subjects.get(i).categorySubjectName);
                        count++;
                    }
                }
                System.out.println(userIdIn + " ID의 수강생이 수강하고 있는 과목은 총 "+ count + "이며 과목명은"
                        + arrayListCategorySubject + "입니다.");
            }
        }
    }
    //3.과목명으로 수강생 이메일 찾기
    public void searchingUserEmailBySujectName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("과목명을 입력하시오.");
        int count = 0;
        ArrayList<String> arrayListEmail = new ArrayList<>();
        String subjectName = scanner.nextLine();
        for (int i = 0; i < InfoCreat.subjects.size(); i++) {
            if (subjectName.equalsIgnoreCase(InfoCreat.subjects.get(i).getCategorySubjectName().toString())) {
                for (int j = 0; j < InfoCreat.subjectRegistrations.size(); j++) {
                    if (InfoCreat.subjectRegistrations.get(j).getSubjectId() == InfoCreat.subjects.get(i).getCategorySubjectId().toString()) {

                        for (int k = 0; k < InfoCreat.users.size(); k++) {
                            if (InfoCreat.users.get(k).getUserID().
                                    equalsIgnoreCase(InfoCreat.subjectRegistrations.get(j).getUserId())) {
                                arrayListEmail.add(InfoCreat.users.get(i).getEmailAddress());
                                count++;
                            }
                        }
                    }
                }
            }
        }System.out.println(subjectName+"과목을 수강하고 있는 학생의 Email은 총 "+ count + "이며 Email은"
                +arrayListEmail+" 입니다");
    }
}
