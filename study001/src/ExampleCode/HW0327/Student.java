package ExampleCode.HW0327;

class Student extends Q3{
    private String name;
    private int ban;
    private int no;
    private int kor;
    private int eng;
    private int mat;

    public Student() {
    }

    public Student(String name, int ban, int no, int kor, int eng, int mat) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
    @Override
    public float getAvg(){
        return (kor+eng+mat)/3;
    }
    @Override
    public String toString(){
        return ban+"반 "+no+"번 "+name ;
    }
}

