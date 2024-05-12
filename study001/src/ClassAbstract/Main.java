package ClassAbstract;

/*
public class StudyGroup.Study0513.Main {
    public static void main(String[] args) {                       //주의 : 변수는 소문자로 쓰기!
        Abstract abstract0 = new Abstract();
        System.out.println(abstract0.getValue());
        System.out.println(abstract0.getString());

        Abstract abstract1 = new Abstract(20,"Apple");
        System.out.println(abstract1.getValue());
        //abstract = 변수인데 인스턴스 - 주소에 저장되있는 값을 기억하고 있다.
        System.out.println(abstract1.getString());
    }
}*/
public class Main {
    public static void main(String[] args) {                       //주의 : 변수는 소문자로 쓰기!
//        Abstract abstract0 = new Abstract(); //추상 클래스는 인스턴스화 할 수 없음
        Child abstract0 = new Child(); // 추상클래스를 상속한 클래스는 인스턴스화 가능
        System.out.println(abstract0.getValue());
        System.out.println(abstract0.getString());

//        Abstract abstract1 = new Abstract(20,"Apple");
        Child abstract1 = new Child(20,"apple");
        System.out.println(abstract1.getValue());
        //abstract = 변수인데 인스턴스 - 주소에 저장되있는 값을 기억하고 있다.
        System.out.println(abstract1.getString());

        Child child2 = new Child();
        child2.setValue(999);
        child2.setString("Banana");
        System.out.println(child2.getValue());
        System.out.println(child2.getString());

    }
}