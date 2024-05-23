package ExampleCode.selfExample;
//클래스 생성
class AB{
    int m = 3;  //필드
    int n = 4;  //필드
    void work1(){
        int k = 5; //지역변수
        System.out.println(k);
        work2(3);
    }
    void work2(int i){ //입력매게변수
        int j = 4; //지역변수
        System.out.println(i + j);
    }
}
public class javaFiled01 {
    public static void main(String[] args) {
        //클래스로 객체 생성
        AB a = new AB();
        //필드값 출력
        System.out.println(a.m);
        System.out.println(a.n);
        //메서드 호출
        a.work1();
    }
}
