package ClassAbstract;


//일반적인 클래스의 모습
/*
public class Abstract {
    //필드
    int a;
    String b;

    //생성자(2종류)
    public Abstract() {                       //기본 생성자
    }

    public Abstract(int a, String b) {       //일반 생성자
        this.a = a;
        this.b = b;
    }

    //메서드
    public int getValue(){
        return a;
    }
    public String getString(){
        return b;
    }
}
*/
/*
public class Abstract {
    //필드
    int a;
    String b;

    //생성자(2종류)
    public Abstract() {                       //기본 생성자
    }

    public Abstract(int a, String b) {       //일반 생성자
        this.a = 10;
        this.b = "default";
    }

    //메서드
    public int getValue(){
        return this.a;
    }
    public String getString(){
        return this.b;
    }
}
*/

/*
//추상메서드
abstract public class Abstract {
    //필드
    int a;
    String b;

    //생성자(2종류)
    public Abstract() {                       //기본 생성자
    }

    public Abstract(int a, String b) {       //일반 생성자
        this.a = 10;
        this.b = "default";
    }

    //메서드
    public int getValue() {
        return this.a;
    }

    //추상메서드
    abstract public String getString();
    //추상클래스는 추상 메소드를 1개 이상 가지고 있으며 추상클래스는 절대 new를 이용하여 생성할 수 없다
    //
}
*/
//추상메서드 말고 setter 사용법
abstract public class Abstract {
    //필드
    int a;
    String b;

    //생성자(2종류)
    public Abstract() {                       //기본 생성자
    }

    public Abstract(int a, String b) {       //일반 생성자
        this.a = 10;
        this.b = "default";
    }

    //메서드
    public int getValue() {
        return this.a;
    }

    abstract public String getString();

    public void setValue(int a) {      //세터(Setter) 메서드
        this.a = a;
    }

    public void setString(String b) {   //세터(Setter) 메서드
        this.b = b;
    }
    //세터 메서드를 만들었다면 Child에서 Override를 제외하고 생성자를 지워도 작동함
}