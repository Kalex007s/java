package Generic;

class GenericMethods { //일반클래스 안에 정의한 제네릭메서드 예제
    public int method0(int a){
        //일반 메서드
        return a;
    }
    public <T> T method1(T t){
        //제네릭 메서드
        return t;
    }
    public <T> boolean method2(T t1, T t2){
        //한 개의 제네릭 타입
        return t1.equals(t2);
    }
    public <K,V> void method3(K k, V v){
        //두 개의 제네릭 타입
        System.out.println(k + " : " + v);
    }
    public <A,B,C> void method4(A a, B b, C c){
        //세 개의 제네릭 타입
        System.out.println(a+" : "+b+" : "+c);
    }
    // 제네릭메서드 내부에서 사용 할 수 있는 메서드
    // 반드시 제네릭 T의 위치에 올 수 있는 모든 클레스들이 사용 가능한 메서드만 쓸 수 있다.
    public <T> void method5r(T t){
        //System.out.println(t.length); // 오류, String클래스라고 단정할 수 없다.
        System.out.println(t.equals("안녕")); // 모든 클래스의 부모인 Object의 메서드는 가능하다.
    }
}

public class GenericMethod {
    public static void main(String[]args){
        GenericMethods gm = new GenericMethods();
        String str1 = gm.<String>method1("안녕"); // -> 원래 문법이나 <String> 생략이 가능
        String str2 = gm.method1("안녕"); // <String> 생략 ( 이유 : 앞뒤 정보로 유추가 가능하기 때문 )
        System.out.println(str1);
        System.out.println(str2);

        boolean bool1 = gm.<Double>method2(2.5,2.5); // 원래문법
        boolean bool2 = gm.method2(2.5,2.5); // <Double> 생략

        gm.<String,Integer>method3("국어",80); // 원래문법(void는 작성하지 않음)
        gm.method3("국어",80); // <String,Integer> 생략

        gm.<String,Double,Integer>method4("평균",88.5,10); //원래문법
        gm.method4("평균",88.5,10); // <String,Double,Integer> 생략
    }
}
