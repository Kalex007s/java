package Entity;

import Entity.Enum.CategorySubjectId;

public class TeacherRegistration {
    private CategorySubjectId categorySubjectId;
    private String teacherId;

    public TeacherRegistration() {
    }

    public TeacherRegistration(String teacherId, CategorySubjectId categorySubjectId) {
        this.categorySubjectId = categorySubjectId;
        this.teacherId = teacherId;
    }

    public CategorySubjectId getCategorySubjectId() {
        return categorySubjectId;
    }

    public void setCategorySubjectId(CategorySubjectId categorySubjectId) {
        this.categorySubjectId = categorySubjectId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
