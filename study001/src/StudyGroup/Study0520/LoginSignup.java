package StudyGroup.Study0520;
//[ 기존회원 명단 ]
//id : alex || pw : a123
//id : ben || pw : benKing00
//id : tom || pw : 9999to99m

import JavaInterface.A;

import java.util.ArrayList;

class LoginSignup {

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> pw = new ArrayList<>();
    public ArrayList<String> createUserInfoId() {
        id.add("alex");
        id.add("ben");
        id.add("tom");
        return id;
    }
    public ArrayList<String> createUserInfoPw() {
        pw.add("a123");
        pw.add("benKing00");
        pw.add("999to99m");
        return pw;
    }

}
