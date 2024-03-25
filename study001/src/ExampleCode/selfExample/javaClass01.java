package ExampleCode.selfExample;


    class A {
        int m = 3;

        void print() {
            System.out.println("객체 생성 및 활용");
        }
    }
    public class javaClass01 {
        public static void main(String[] ars){
            A a = new A(); // Class A 타입의 변수 a는 새로운 생성자로 만든 객체의 주소를 가르키는 참조변수이다.
            a.m =5; // Class A에 m을 제선언하여 값을 변경 ->변경하지 않았다면 (a.m)의 출력값은 3
            System.out.println(a.m);

            a.print();
        }
}
