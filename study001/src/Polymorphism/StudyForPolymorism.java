package Polymorphism;

//상속을 이용한 객체의 다형적 표현
class A {}
class B extends A{}
class C extends B{}
class D extends B{}

public class StudyForPolymorism {
    public static void main(String[] args) {
        // A타입의 다형적 표현
        A a1 = new A();
        A a2 = new B();
        A a3 = new C();
        A a4 = new D();

        //나머지 써야함 p.318
    }


}
