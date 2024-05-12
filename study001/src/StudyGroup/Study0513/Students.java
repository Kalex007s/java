package StudyGroup.Study0513;

import JavaInterface.A;

import java.util.Arrays;
import java.util.Scanner;

class Students {

    int classNum = 4;
    String [] studentsName = new String[classNum];
    int [] studentsAge = new int[classNum];


    void inPutName() {
        for (int i = 0; i < studentsName.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("이름을 입력하시오");
            studentsName[i] =  scanner.nextLine();
        }
    }

    void printAllName() {
        for (int i = 0; i < studentsName.length; i++) {
            System.out.println(studentsName[i]);
        }
    }

    void inPutAge() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < studentsAge.length; i++) {
            System.out.println("나이를 입력하시오");
            studentsAge[i] =  scanner.nextInt();
        }
    }
    void avgAge() {
        double sum = 0;
        double avg;
        for (int i = 0; i < studentsAge.length; i++) {
            sum = sum + studentsAge[i];
        }
        avg = sum/studentsAge.length;
        System.out.println("반 평균 나이 : " + avg);

    }
}