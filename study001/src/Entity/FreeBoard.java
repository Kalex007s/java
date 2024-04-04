package Entity;

import java.util.ArrayList;

public class FreeBoard {

    private int freeBoardId;
    private String freeBoardTitle;
    private String freeBoradContent;
    private String uerId;
    private ArrayList<Reply> replies = new ArrayList<>();



    public FreeBoard() {
    }

    public FreeBoard(int freeBoardId, String freeBoardTitle, String freeBoradContent, String uerId) {
        this.freeBoardId = freeBoardId;
        this.freeBoardTitle = freeBoardTitle;
        this.freeBoradContent = freeBoradContent;
        this.uerId = uerId;
    }

    public int getFreeBoardId() {
        return freeBoardId;
    }

    public void setFreeBoardId(int freeBoardId) {
        this.freeBoardId = freeBoardId;
    }

    public String getFreeBoardTitle() {
        return freeBoardTitle;
    }

    public void setFreeBoardTitle(String freeBoardTitle) {
        this.freeBoardTitle = freeBoardTitle;
    }

    public String getFreeBoradContent() {
        return freeBoradContent;
    }

    public void setFreeBoradContent(String freeBoradContent) {
        this.freeBoradContent = freeBoradContent;
    }

    public String getUerId() {
        return uerId;
    }

    public void setUerId(String uerId) {
        this.uerId = uerId;
    }

    public ArrayList<Reply> getReplies() {
        return replies;
    }

    public void setReplies(Reply reply) {
        replies.add(reply);
    }

    @Override
    public String toString() {
        return "(" + freeBoardId + freeBoardTitle + freeBoradContent + uerId + ")";
    }

}
