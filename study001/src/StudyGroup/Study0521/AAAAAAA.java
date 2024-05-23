//package StudyGroup.Study0521;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//class NameStu {
//}
//
//
//public class AAAAAAA {
//
//    //DW 고등학교 1학년 신입생 이름 저장 프로그램
//    //조건 : 외부클래스 사용 / 입력매게변수 사용
//    //각 A,B,C반이 있으며 각 반의 학생은 5명으로 규정한다.
//    public static void main(String[] args) {
//
//        String[] a = new String[5];
//        String[] b = new String[5];
//        String[] c = new String[5];
//
//        Scanner scanner = new Scanner(System.in);
//
//        //a반 학생 입력
//        for (int i = 0; i < a.length; i++) {
//            a[i] = scanner.nextLine();
//        }
//        //b반 학생 입력
//        for (int i = 0; i < b.length; i++) {
//            b[i] = scanner.nextLine();
//        }
//        //c반 학생 입력
//        for (int i = 0; i < c.length; i++) {
//            c[i] = scanner.nextLine();
//        }
//
//        System.out.println("A,B,C 반 중 하나의 반을 입력 하세요");
//        String result = scanner.nextLine();
//        if (result.equalsIgnoreCase("a")) {
//            System.out.println(Arrays.toString(a));
//        } else if (result.equalsIgnoreCase("b")) {
//            System.out.println(Arrays.toString(b));
//        } else if (result.equalsIgnoreCase("c")) {
//            System.out.println(Arrays.toString(c));
//        }
//    }
//}

package StudyGroup.Study0521;

import java.util.Arrays;
import java.util.Scanner;

class NameStu {
    public String [] studentName(String [] className) {
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < className.length; i++) {
            className[i] = userInput.nextLine();
        }
        return className;
    }
}


public class AAAAAAA {

    //DW 고등학교 1학년 신입생 이름 저장 프로그램
    //조건 : 외부클래스 사용 / 입력매게변수 사용
    //각 A,B,C반이 있으며 각 반의 학생은 5명으로 규정한다.
    public static void main(String[] args) {
        String [] a = new String[5];
        String [] b = new String[5];
        String [] c = new String[5];

        NameStu nameStu = new NameStu();

        a = nameStu.studentName(a);
        b = nameStu.studentName(b);
        c = nameStu.studentName(c);


    }
}