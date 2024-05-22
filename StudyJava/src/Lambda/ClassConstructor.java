package Lambda;

interface  CC{
    MyClass method();
}
interface CC2{
    MyClass method(int k);
}
class MyClass{
    int k;

    public MyClass() {
        System.out.println("MyClass의 기본 생성자");
    }
    MyClass(int k){
        System.out.println("MyClass의 매개변수 생성자 "+k);
        this.k = k;
    }
}
public class ClassConstructor {
    public static void main(String[] args) {
        //함수인터페이스 메서드가 외부클래스를 리턴하는 경우
        //메서드내에선 외부클래스의 생성자를 이용하여 객체를 생성해야함

        CC a1 = new CC() { //익명 이너 클래스
            @Override
            public MyClass method() {
                return new MyClass();
            }
        };
        CC a2 = () -> new MyClass(10); //람다식 단축형 1
        CC a3 = MyClass::new; // 람다식 단축형 2
        a2.method();
        a3.method();

        System.out.println();

        CC2 c1 = (int k) -> new MyClass(k);
        CC2 c2 = MyClass::new;
        c2.method(5);
    }
}
