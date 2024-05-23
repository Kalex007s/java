package Entity;

public class SubjectRegistration {
    String userId;
    String SubjectId;


    public SubjectRegistration() {
    }
    public SubjectRegistration(String userId, String subjectId) {
        this.userId = userId;
        SubjectId = subjectId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(String subjectId) {
        SubjectId = subjectId;
    }
}