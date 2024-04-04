package Entity;

public class Reply {
    private String repleId;
    private String repleContent;
    private String userId;

    public Reply() {
    }

    public Reply(String repleId, String repleContent, String userId) {
        this.repleId = repleId;
        this.repleContent = repleContent;
        this.userId = userId;
    }

    public String getRepleId() {
        return repleId;
    }

    public void setRepleId(String repleId) {
        this.repleId = repleId;
    }

    public String getRepleContent() {
        return repleContent;
    }

    public void setRepleContent(String repleContent) {
        this.repleContent = repleContent;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString(){
        return "( "+ repleId + repleContent + userId + ")";
    }
}
