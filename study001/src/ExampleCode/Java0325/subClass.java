package ExampleCode.Java0325;

abstract public class subClass {
    String Name = "Steve";
    String Department = "Physics";
    int StudentId = 10001;

    public subClass() {
    }

    public subClass(String name, String department, int studentId) {
        Name = name;
        Department = department;
        StudentId = studentId;
    }
    public String setName(){
        return this.Name;
    }
    public String setDepartment(){
        return this.Department;
    }
    public int setStudentId(){
     return this.StudentId;
    }
    abstract public String toString();

    public void setName(String name) {      //세터(Setter) 메서드
        this.Name = name;
    }
    public void setDepartment(String department) {      //세터(Setter) 메서드
        this.Department = department;
    }
    public void setStudentId(int studentId) {      //세터(Setter) 메서드
        this.StudentId = studentId;
    }


}
