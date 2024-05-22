package Generic;

class A {}
class B extends A {}
class C extends B {}

class  D<T extends B> {
    // 제네릭 모든 클래스가 올 수 있으나
    // <T extends B>는 B와 B의 자식만 올 수 있다! ( A는 안되고 B,C는 됨)
    // D가 B를 상속하고 있는 것이 아니라,  D에 속해 있는 제네릭 클래스가 B를 상속하고 있는 것
    private T t;
    public  T get() {return t;}
    public void set(T t){this.t = t;}

}
public class JenericExtends {
    public static void main(String[]args){
        //D<A> d1 = new D<A>(); //A클래스는 D의 제네릭T 범위 안에 없다.
        D<B> d2 = new D<>();
        D<C> d3 = new D<>();
        D d4 = new D(); //<B를 생략한 문법 => 원래문법 => D<B> d2 = new D<>();

        d2.set(new B());
        d2.set(new C());
        //d3.set(new B()); // C만 받을 수 있음
        d3.set(new C());
        d4.set(new B());
        d4.set(new C());
    }
}
