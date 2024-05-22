package This;

class AA{
    AA() {
        System.out.println("첫 번째 생성자");
    }
    AA(int a){
        this(); //반드시 생성자의 첫번째 줄에 위치해야 한다.
        System.out.println("두 번째 생성자");
    }

    /*
    void abc() {
        this();  //메서드 내에서는 this() 메서드 사용 불가능
    }
    */
}
public class ThisMethod01 {
    public static void main(String[] args) {
        AA aa1 = new AA(); // 첫번째 생성자 호출
        System.out.println();
        AA aa2 = new AA(3);
    }
}
