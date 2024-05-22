package Lambda;

//함수형 인터페이스
interface AA{
    void abc();
}
class LabraryB{ // 내가 만든 클래스가 아닌 라이브러리 클래스라고 가정
    void methodLabraryB(){
        System.out.println("원래 존재하는 라이브러리 메서드");
    }
}
interface AA2{
    void methodAA2(String str);
}

public class InstanceMethodType {
    public static void main(String[] args) {
        AA aa0 = new AA(){ //익명 이너 클래스
            @Override
            public void abc(){
                LabraryB b = new LabraryB();
                b.methodLabraryB();
            }
        };
        //내가 만든 함수형 인터페이스 메서드에서 외부 클래스의 메서드를 사용하려면
        //그 외부클래스의 인스턴스가 필요하므로 아래처럼 인스턴스 과정이 필요
        AA aa = () -> {
            LabraryB b = new LabraryB();
            b.methodLabraryB();
        };
        //위의 코드에서 람다식내의 중괄호를 없애는 최대 축약형
        LabraryB b = new LabraryB();
        AA aa1 = b::methodLabraryB;
        aa1.abc();

        //AA@ 함수형 인터페이스는 화면출력을 위하여 외부 클래스인 System.out.println을 사용
        AA2 aa2 = (String str) -> System.out.println(str);
        AA2 aa3 = System.out::println; //양쪽 모두 매개변수가 존재해야 한다.
        aa3.methodAA2("이것은 무리수");
    }
}
