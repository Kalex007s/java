package StudyGroup.Study0330;


//변수 i의 값에 따라 출력이 변하는 코드를 Switch 문을 이용하여 작성하시오.
//I의 값은 3으로 하며 1일때는 사과 2일때는 오렌지
// 3일때는 딸기 4일때는 참외 5일때는 배가 출력되야 함

public class HW05 {
    public static void main(String[] args) {
        //변수선언
        int i = 3;

        switch(i) {
            case (1):
                System.out.println("사과");
                break;
            case (2):
                System.out.println("오렌지");
                break;
            case (3):
                System.out.println("딸기");
                break;
            case (4):
                System.out.println("참외");
                break;
            case (5):
                System.out.println("배");
                break;
        }
    }
}
