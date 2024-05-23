package StudyGroup.Study0521;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Students {

    public String [] inputStudents(String [] className){
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < className.length; i++) {
            className[i] = userInput.nextLine();
        }
        return className;
    }
}
public class HW01 {
    //DW 고등학교 1학년 신입생 이름 저장 프로그램
    //조건 :) 외부클래스 사용 / 입력매게변수 사용
    //각 A,B,C반이 있으며 각 반의 학생은 5명으로 규정한다.
    public static void main(String[] args) {
        String [] aClass = new String[5];
        String [] bClass = new String[5];
        String [] cClass = new String[5];

        Students students = new Students();
        aClass = students.inputStudents(aClass);
        bClass = students.inputStudents(bClass);
        cClass = students.inputStudents(cClass);
    }
}
