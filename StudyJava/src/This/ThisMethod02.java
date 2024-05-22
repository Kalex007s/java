package This;

class AAA {
    int m1,m2,m3,m4;
    AAA () {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    AAA (int a) {
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    AAA (int a, int b) {
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }
    void print() {
        System.out.println("m1" + " ");
        System.out.println("m2" + " ");
        System.out.println("m3" + " ");
        System.out.println("m4" + " ");
    }
    class BBB {
        int m1,m2,m3,m4;
        BBB() {
            m1 = 1;
            m2 = 2;
            m3 = 3;
            m4 = 4;
        }
        BBB (int a) {
            this();     // BBB () 생성자 호출
            m1 = a;
        }
        BBB (int a,int b) {
            this(3);  // BBB(int a) 생성자 호춢
            m2 =  2;
        }
       /*
        BBB (int a, int b) {   // BBB() 생성자를 호출하고, 두 필드 값을 한 번에 수정할 수 도 있다.
            this();
            m1 = a;
            m2 = b;
        }
        */
    }
}
public class ThisMethod02 {
}
