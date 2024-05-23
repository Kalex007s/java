package TypeCasting.TypeCasting01;

//클래스의 업캐스팅 및 다운캐스팅

//# 클래스의 상속관계
class A {}
class B extends A {}
class C extends B{}
class D extends B{}

public class TypeCasting01 {
    public static void main(String[] args) {
        //#1. 업캐스팅 (자동변환): 생략시 컴파일러가 자동 추가
        A ac = (A)new C(); // C->A 업캐스팅 (자동변환)
        B bc = (B)new C(); // C->B 업캐스팅 (자동변환)

        B bb = new B();
        A a = (A)bb; //B->A 업캐스팅 (자동변환)

        //#2-1. 다운캐스팅 (수동변환) : 캐스팅이 불가능한 경우 (실행시 예외발생)
        A aa = new A();
//		B b = (B)aa; //A->B 다운캐스팅 (수동변환)
//		C c = (C)aa; //A->C 다운캐스팅 (수동변환)

        //#2-2. 다운캐스팅 (수동변환) : 캐스팅이 가능한 경우
        A ab = new B();
        B b = (B)ab; //A->B 다운캐스팅 (수동변환)
//		C c = (C)ab; //A->C 다운캐스팅 (수동변환) : 불가능 = A,B안에 C가 없으므로 안된다.

        /*//#2-2. 캐스팅이 가능한 경우를 가능하게
        A ab = new B();
        //1000라인의 코드가 있음
        //아래 ab변수를 B 또는 C 타입으로 캐스팅이 필요할 경우!!
         if (ab instanceof C) {
                    B b = (B) ab;
                }else if (ab instanceof C){
                    C c = (C)ab; //A->C 다운캐스팅 (수동변환) : 불가능
                }else {
                    System.out.println("둘 다 아니네..잘못짰다..");
                }
        B b = (B)ab; //A->B 다운캐스팅 (수동변환)*/

        B bd = new D();
        D d = (D)bd; //B->D 다운캐스팅 (수동변환)

        A ad = new D();
        B b1 = (B)ad; //A->B 다운캐스팅 (수동변환)
        D d1 = (D)ad; //A->D 다운캐스팅 (수동변환)
    }
}