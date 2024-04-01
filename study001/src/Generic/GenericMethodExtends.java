package Generic;

class AA{
    public <T extends Number> void methods1(T t){
        System.out.println(t.intValue());
    }
}

interface Myinterface {
    public abstract void print();
}
class CC implements Myinterface{
    //d인터페이스의 구현체
    public void print() {
        System.out.printf("print() 구현2");
    }
}
class BB {
    public <T extends Myinterface> void method1(T t){
        // 사용자가 정의한 MyInterface의 자식만 제네릭T 위치에 올 수 있다.
        // 이렇게 함으로써 사용자 정의 메서드인 print()를 사용할 수 있게 된다.
        t.print();
    }
}
public class GenericMethodExtends {
    public static void main(String[]args){
        AA a = new AA();
        a.methods1(5.8); // <Double>

        BB b = new BB();
        b.method1(new Myinterface() {
            // 1)익명 이너클래스 사용한 경우
            @Override
            public void print() {
                System.out.println("print() 구현");
            }
        });
        b.method1(new CC());
        // 2) MyInterface의 구현체를 사용한 경우

    }
}
