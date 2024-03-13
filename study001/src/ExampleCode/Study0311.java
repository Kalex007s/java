package ExampleCode;/*public class ExampleCode.Study0311 {*/
/*    public static void main(String[] args) {
        //클래스의 생성자가 없는 경우 => 기본생성자가 자동으로 만들어짐
        //매개변수가 있는 생성자만 있는경우 => 기본생성자는 만들어지지 않는다!!
        //생성자의 오버로딩
        Students.Students a = new Students.Students();
        Students.Students tom = new Students.Students("tom",20,"Seoul","12345");
        Students.Students steve = new Students.Students("steve",25,"LA");
    }*/

class A{
        int m1,m2,m3,m4;
        A(){
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
        }
        A(int a) {
            m1 = a;
            m2 = 2;
            m3 = 3;
            m4 = 4;
        }
        A(int a, int b) {
            m1 = a;
            m2 = b;
            m3 = 3;
            m4 = 4;
        }
        void print(){
            System.out.print(m1+" ");
            System.out.print(m2+" ");
            System.out.print(m3+" ");
            System.out.print(m4);
            System.out.println();
        }
}
class B{
    int m1,m2,m3,m4;
    B(){
        m1=1;
        m2=2;
        m3=3;
        m4=4;
    }
    B(int a){
        this();
        m1=a;
    }
    B(int a,int b) {
        this(a);
        m2 = b;
    }
    void print(){
        System.out.print(m1+" ");
        System.out.print(m2+" ");
        System.out.print(m3+" ");
        System.out.println(m4);
        System.out.println();
    }
}
public class Study0311{
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A(10);
        A a3 = new A(10, 20);
    }
}

