package Lambda;

interface A{
    //public abstract가 생략
    void method1();  // 입력과 리턴 모두 없다.
}
interface B{
    void method2(int a); //입력이 있고 리턴 없다.
}
interface C{
    int method3(); //입력이 없고 리턴 있다.
}
interface D{
    double method4(int a, double b); //입력과 리턴 모두 있다.
}
public class LambdaExpression {
    public static void main(String[] args) {
        //원래 형식에서 클래스 상속없이 메서드를 사용할 수 있는 유일한 형식
        A a0 = new A(){ //익명 이너 클래스
            public void method1() {
                System.out.println("pattern 1");
            }
        };
        // a0.method1();
        //람다식(A 형태의 단축형)
        A a = ()-> System.out.println("pattern 1");
        a.method1();
        //람다식(B 형태의 단축형)
        B b = (int x) -> System.out.println("pattern 2 : "+x);
        B b1 = (x) -> System.out.println("pattern 2 : "+x); // 매개변수가 두 개인 경우 축약형
        B b2 = x -> System.out.println("pattern 2 : "+x); //매개변수가 하나인 경우만 소괄호가 삭제 가능
        b2.method2(5);

        C c = () -> { return 4; }; //return이 있으므로 중괄호가 필요
        C c1 = () -> 4; //return을 생략하려면 중괄호도 같이 생략
        System.out.println(c1.method3());

        D d = (int x, double y) -> { return x+y; };
        D d1 = (int x, double y) -> x+y;
        D d2 = (x,y) -> x+y;
        System.out.println(d2.method4(10,5.5));
    }

}
