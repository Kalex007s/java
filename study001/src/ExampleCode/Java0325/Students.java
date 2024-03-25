package ExampleCode.Java0325;

import javax.naming.Name;

public class Students extends subClass {

    public Students() {
    }

    public Students(String name, String department, int studentId) {
        super(name, department, studentId);
    }

    @Override
    public String toString() {
        return super.setName()+", "+setDepartment()+", "+setStudentId();
    }
}















    /*
    public Students(String name, String department, int studentId) {
        this.Name = "Steve";
        this.Department = "Physics";
        this.StudentId = 10001;
    }


    public String getName(){
        return Name;
    }
    public String getDepartment(){
        return Department;
    }
    public int getStudentId(){
        return StudentId;
    }

    public String toString() {
        return ();
    }


    public void setName(String name) {
        Name = name;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
    */

