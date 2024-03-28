package Entity;

public class Subject {
    private int subjectID;
    private int subjectCredits;
    private int totalStudents;
    private String subjectName;
    private String subjectCode;
    private String subjectDescription;
    private String subjectTimetable;
    private String subjectProfessor;
    private String subjectLevel;
    private String subjectLocation;
    private String subjectType;

    public Subject() {
    }

    public Subject(String subjectName, int subjectID, int totalStudents, String subjectLevel, String subjectLocation) {
        this.subjectID = subjectID;
        this.totalStudents = totalStudents;
        this.subjectName = subjectName;
        this.subjectLevel = subjectLevel;
        this.subjectLocation = subjectLocation;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getSubjectCredits() {
        return subjectCredits;
    }

    public void setSubjectCredits(int subjectCredits) {
        this.subjectCredits = subjectCredits;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
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

    public String getSubjectLevel() {
        return subjectLevel;
    }

    public void setSubjectLevel(String subjectLevel) {
        this.subjectLevel = subjectLevel;
    }

    public String getSubjectLocation() {
        return subjectLocation;
    }

    public void setSubjectLocation(String subjectLocation) {
        this.subjectLocation = subjectLocation;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    @Override
    public String toString(){
        return "Lecture Info.\n학과명: "+subjectName+" /학과 ID: "+subjectID+" /수업 레벨: "+subjectLevel+
                " /수강가능인원: "+totalStudents+" /수강지역: "+subjectLocation;
    }
}

