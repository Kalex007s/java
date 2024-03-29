package Entity;

import Entity.Enum.*;

public class Subject {
    CategorySubject categorySubjectName;
    CategorySubjectId categorySubjectId;
    private int subjectCredits;
    CategoryTotalStudents categoryTotalStudents;
    private String subjectCode;
    private String subjectDescription;
    private String subjectTimetable;
    private String subjectProfessor;
    CategoryLevel categoryLevel;
    CategorySubjectLocation categorySubjectLocation;
    private String subjectType;

    public Subject() {
    }

    public Subject(CategorySubject categorySubject, CategorySubjectId categorySubjectId, CategoryTotalStudents categoryTotalStudents, CategoryLevel categoryLevel, CategorySubjectLocation categorySubjectLocation) {
        this.categorySubjectName = categorySubject;
        this.categorySubjectId = categorySubjectId;
        this.categoryTotalStudents = categoryTotalStudents;
        this.categoryLevel = categoryLevel;
        this.categorySubjectLocation = categorySubjectLocation;
    }

    public CategorySubject getCategorySubjectName() {
        return categorySubjectName;
    }

    public void setCategorySubjectName(CategorySubject categorySubjectName) {
        this.categorySubjectName = categorySubjectName;
    }

    public CategorySubjectId getCategorySubjectId() {
        return categorySubjectId;
    }

    public void setCategorySubjectId(CategorySubjectId categorySubjectId) {
        this.categorySubjectId = categorySubjectId;
    }

    public int getSubjectCredits() {
        return subjectCredits;
    }

    public void setSubjectCredits(int subjectCredits) {
        this.subjectCredits = subjectCredits;
    }

    public CategoryTotalStudents getCategoryTotalStudents() {
        return categoryTotalStudents;
    }

    public void setCategoryTotalStudents(CategoryTotalStudents categoryTotalStudents) {
        this.categoryTotalStudents = categoryTotalStudents;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public String getSubjectTimetable() {
        return subjectTimetable;
    }

    public void setSubjectTimetable(String subjectTimetable) {
        this.subjectTimetable = subjectTimetable;
    }

    public String getSubjectProfessor() {
        return subjectProfessor;
    }

    public void setSubjectProfessor(String subjectProfessor) {
        this.subjectProfessor = subjectProfessor;
    }

    public CategoryLevel getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(CategoryLevel categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public CategorySubjectLocation getCategorySubjectLocation() {
        return categorySubjectLocation;
    }

    public void setCategorySubjectLocation(CategorySubjectLocation categorySubjectLocation) {
        this.categorySubjectLocation = categorySubjectLocation;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    @Override
    public String toString(){
        return "Lecture Info.\n학과명: "+ categorySubjectName +" /학과 ID: "+categorySubjectId+" /수업 레벨: "+categoryLevel+
                " /수강가능인원: "+categoryTotalStudents+" /수강지역: "+categorySubjectLocation;
    }
}

