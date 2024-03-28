package Entity;

public class SubjectRegistration {
    String userId;
    int SubjectId;


    public SubjectRegistration() {
    }

    public SubjectRegistration(String userId, int subjectId) {
        this.userId = userId;
        this.SubjectId = subjectId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(int subjectId) {
        SubjectId = subjectId;
    }
}
