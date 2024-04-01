package Notion.Class;

//클래스의 정의
class A {
    //리턴 타입 void, 입력매개변수 없음.
    void print() {
        System.out.printf("안녕");
    }

    //리턴 타입 int, 입력매개변수 없음.
    int data() {
        return 3;
    }

    double sum(int a, double b) {
        return a + b;
    }
    //리턴 타입 void, 내부에 리턴 포함(함수를 종료함)
    void printMonth(int m){
        if(m < 0 || m > 12){
            System.out.println("잘못된 입력입니다.");
            return;
        }
        System.out.println(m+"월 입니다.");
    }
}
public class ExternalCallMethods {
    public static void main(String[] args) {
        //객체 생성
        A 
    }

}
