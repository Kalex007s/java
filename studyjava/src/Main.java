public class Main {
    public static void main(String[] args) {
       /*
        boolean x = true;

        if (x) {
            System.out.println("테스트중");
        }
        if (!x) {
            System.out.println("테스트중");
         }

        if (x) {
            System.out.println("x는 true");
        }else {
            System.out.println("x는 fales");
        }
        */

        /*
        boolean a = false;
        boolean b = false;
        boolean c = true;
        if (a) {
            System.out.println("a가 true");
        } else if (b) {
            System.out.println("a는 false, b가 true");
        } else if (c) {
            System.out.println("a,b는 false, c가 true");
        } else {
            System.out.println("a,b,c는 false");
        }
*/
        //학점 코드 (범위를 나타내는 조건식
        //조건식에 사용된 범위가 전체 100%를 커버해야한다.
        //조건을 중복 해당되도록 만들면 안됨.
        int score = 91;
        if (score >= 90) {
            System.out.println("A 학점");
        } else if (score >= 80 && score < 90) {
            System.out.println("B 학점");
        } else if (score >= 70 && score < 80) {
            System.out.println("C 학점");
        } else if (score >= 60 && score < 70) {
            System.out.println("D 학점");
        } else {
            System.out.println("F학점 넌 걍 그만 나와라");

        }
        //if문 속의 if문
        if (true) {
            if (true) {
                if (true) {
                    System.out.println("if문 속의 if문");
                }
            }
}
}
}