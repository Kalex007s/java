package Generic;

class Myclass<T>{
    private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}
public class Generic1 {
    public static void main(String[]args){
        Myclass<String> mc1 = new Myclass<>(); // 클래스의 생성단계
        mc1.set("안녕"); //생성단계에서 자료형을 결정했기 때문에 입력단계에서 특정 자료형만 받음
        System.out.println(mc1.get());
        Myclass<Integer> mc2 = new Myclass<>(); //Integer는 int자료형의 wrapper클래스
        mc2.set(100);
        System.out.println(mc2.get());
    }
}
