package ClassAbstract;

public class Child extends Abstract{

    //기본 생성자 자동 생성
    public Child() {
        super(); // 자동으로 생성
    }

    public Child(int a, String b) {
        super(a, b);
    }

    @Override
    public String getString() {
        return super.b;
    }
    //반드시 오버라이드 해주지 않으면 안됌
    //절대적인 원칙

    //위에 있는 생성자를 생성할 때 [Child abstract1 = new Child(20,"apple");] 이런 식의 생성을 만들려고 한다면
    //똑같이 생성자를 만들어줘야한다.

    public void setValue(int a){
        super.setValue(a); // java style 자바는 세터와 게터를 사용하는 것을 추천함!!!!!!!!
        //super.a = a; //비추천. Java 스타일이 아님
    }

    public void setString(String b) {
        super.setString(b);
    }
}
