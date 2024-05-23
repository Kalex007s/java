package Entity;

public class Reply {
    private int repleId;
    private String repleContent;
    private String userId;
    private int freeBoardId;

    public Reply() {
    }

    public Reply(int repleId, String repleContent, String userId, int freeBoardId) {
        this.repleId = repleId;
        this.repleContent = repleContent;
        this.userId = userId;
        this.freeBoardId = freeBoardId;
    }

    public Reply(String repleContent, String userId,int freeBoardI ){
        this (InfoCreat.replyArrayList.size()+1,repleContent,userId,freeBoardI);
    }
    public int getRepleId() {
        return repleId;
    }

    public void setRepleId(int repleId) {
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

    public int getFreeBoardId() {
        return freeBoardId;
    }

    public void setFreeBoardId(int freeBoardId) {
        this.freeBoardId = freeBoardId;
    }

    @Override
    public String toString(){
        return "( "+ repleId +", " + repleContent +", " + userId +", " + freeBoardId +")";
    }
}
