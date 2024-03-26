package JavaInterface;

public interface A {
    public static final int a = 10; //public static final생략가눙
    //인터페이스 자체로 추상이기 떄문에 앞에 abstract를 붙이지 않음
    //인터페이스는 추상메서드(미완성메서드)로 이루어져있음.
    //인터페이스는 기번적으로 양방통신을 목적으로 만들어졌기 때문메 public 사용
    public abstract void abc(); //public abstract 생략가능

}
