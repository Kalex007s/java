public class StudyForClass {
    private String name;
    private int age;
    private String address;

    private String persnalNum; // private 을 써주면 값을 숨겨줌 퍼블릭에서 변경됨



    //생성자 만들기
    //습관들이기 - 기본생성자와 생성자 두 종류를 모두 만들어야한다.
    //1.마우스 우클릭 - Generator -> Costructor

    public StudyForClass(String name, int age, String address,String persnalNum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.persnalNum = persnalNum;

        //생성자가 생성됨
    }
    //게터와세터
    //메소드는 앞에 void 혹은 리턴값을 가져야한다.(리턴타입)-최종 값이 리턴된다.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersnalNum() {
        return persnalNum;
    }



    //2.마우스 우클릭 - Generator -> Costructor ->  selcect none
    public StudyForClass() { //기본생성자
    }

    //메소드 만들기
    public void displayName() {
        System.out.println(this.name);
    }
    public void Dsiplayage(){
        System.out.println(this.age);
    }
    public void dsiplayadress(){
        System.out.println(this.address);
    }
    public void displayAll(){
        System.out.println(this.name+" "+this.age+" "+this.address);
    }
}
