package Entity;

import Entity.Enum.CategoryTeacherClass;
import Entity.Enum.CategoryTeacherMajor;

public class Teacher {
    private String teacherId;
    private CategoryTeacherClass teacherClass;
    private CategoryTeacherMajor teacherMajor;

    public Teacher() {
    }
    public Teacher(String teacherId, CategoryTeacherMajor teacherMajor, CategoryTeacherClass teacherClass) {
        this.teacherId = teacherId;
        this.teacherClass = teacherClass;
        this.teacherMajor = teacherMajor;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public CategoryTeacherClass getTeacherClass() {
        return teacherClass;
    }

    public void setTeacherClass(CategoryTeacherClass teacherClass) {
        this.teacherClass = teacherClass;
    }

    public CategoryTeacherMajor getTeacherMajor() {
        return teacherMajor;
    }

    public void setTeacherMajor(CategoryTeacherMajor teacherMajor) {
        this.teacherMajor = teacherMajor;
    }

    @Override
    public String toString(){
        return "teacher Info. ( "+ teacherId + ", " + teacherMajor + ", " + teacherClass + " )";
    }
}
