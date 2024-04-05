package Entity;

import Entity.Enum.CategoryRating;
import Entity.Enum.CategorySubject;
import Entity.Enum.CategorySubjectId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Method {

    //1.과목 아이디 찾기
    public void searchingUserIdBySujectId() {
        System.out.println("찾고자 하는 과목의 과목아이디를 입력하시오.");
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        String sujectIdIn = String.valueOf(sc);

        ArrayList<String> arrayListID = new ArrayList<>();
        for (int i = 0; i < InfoCreat.subjectRegistrations.size(); i++) {
            if (InfoCreat.subjectRegistrations.get(i).getSubjectId() == sujectIdIn) {
                arrayListID.add(InfoCreat.subjectRegistrations.get(i).getUserId());
                count++;
            }
        }
        System.out.println("과목 아이디(" + (sujectIdIn) + ")을 수강 하는 학생 수는 총 "
                + count + "이며 수강생의 ID는 " + arrayListID + " 입니다.");
    }

    //2.수강생 ID로 과목명 찾기
    public void searchingSubjectNameByUserId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("수강생 ID를 입력하시오.");
        int count = 0;
        String userIdIn = scanner.nextLine();
        ArrayList<CategorySubject> arrayListCategorySubject = new ArrayList<>();
        for (int i = 0; i < InfoCreat.subjectRegistrations.size(); i++) {
            if (InfoCreat.subjectRegistrations.get(i).getUserId().equalsIgnoreCase(userIdIn)) {
                for (int j = 0; j < InfoCreat.subjects.size(); j++) {
                    if (InfoCreat.subjectRegistrations.get(i).getSubjectId().equalsIgnoreCase(InfoCreat.subjects.get(j).getCategorySubjectId().toString())){
                        arrayListCategorySubject.add(InfoCreat.subjects.get(i).categorySubjectName);
                        count++;
                    }
                }
                System.out.println(userIdIn + " ID의 수강생이 수강하고 있는 과목은 총 "+ count + "이며 과목명은"
                        + arrayListCategorySubject + "입니다.");
            }
        }
    }
    //3.과목명으로 수강생 이메일 찾기
    public void searchingUserEmailBySujectName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("과목명을 입력하시오.");
        int count = 0;
        ArrayList<String> arrayListEmail = new ArrayList<>();
        String subjectName = scanner.nextLine();
        for (int i = 0; i < InfoCreat.subjects.size(); i++) {
            if (subjectName.equalsIgnoreCase(InfoCreat.subjects.get(i).getCategorySubjectName().toString())) {
                for (int j = 0; j < InfoCreat.subjectRegistrations.size(); j++) {
                    if (InfoCreat.subjectRegistrations.get(j).getSubjectId() == InfoCreat.subjects.get(i).getCategorySubjectId().toString()) {

                        for (int k = 0; k < InfoCreat.users.size(); k++) {
                            if (InfoCreat.users.get(k).getUserID().
                                    equalsIgnoreCase(InfoCreat.subjectRegistrations.get(j).getUserId())) {
                                arrayListEmail.add(InfoCreat.users.get(i).getEmailAddress());
                                count++;
                            }
                        }
                    }
                }
            }
        }System.out.println(subjectName+"과목을 수강하고 있는 학생의 Email은 총 "+ count + "이며 Email은"
                +arrayListEmail+" 입니다");
    }

    public boolean createReview(String userId, CategorySubjectId subjectId
            , CategoryRating rating, String text) {
        // 점수체크
//        if (rating < 1 || rating > 10) {
//            System.out.println("평가점수는 1~10점 사이입니다.");
//            return false;
//        }
        // 기존 리뷰 확인
        if (!InfoCreat.reviews.isEmpty()) {
            for(Review review : InfoCreat.reviews) {
                if (review.getUserId().equalsIgnoreCase(review.getUserId())
                        && review.getSubjectId().equals(subjectId)) {
                    System.out.println("이미 작성한 리뷰가 있습니다.");
                    return false;
                }
            }
        }
        // 수강여부 확인
        boolean canReview = false;
        for(SubjectRegistration registration : InfoCreat.subjectRegistrations) {
            if (registration.getUserId().equals(userId)
                    && registration.getSubjectId().equalsIgnoreCase(String.valueOf(subjectId))) {
                canReview = true;
                break;
            }
        }
        if (!canReview) {
            System.out.println("리뷰 작성 권한이 없습니다.");
            return false;
        }
        InfoCreat.reviews.add(new Review(InfoCreat.reviews.size()+1, userId, subjectId, rating, text));
        System.out.println(InfoCreat.reviews.toString());
        return true;
    }

    public void getTeacherBySubjectId(CategorySubjectId subjectId){
        for(int i=0;i<InfoCreat.teacherRegistrations.size();i++){
            if(InfoCreat.teacherRegistrations.get(i).getCategorySubjectId().equals(subjectId)) {
                System.out.println("해당 과목ID을 가르치는 선생님의 TeacherId는 : " + InfoCreat.teacherRegistrations.get(i).getTeacherId());
            }
        }
    }

    public void getSubjectListByTeacherId(String teacherId) {
        ArrayList<String>subjectListByTeacherId = new ArrayList<>();
        for(int i=0;i<InfoCreat.teacherRegistrations.size();i++){
            if(InfoCreat.teacherRegistrations.get(i).getTeacherId().equalsIgnoreCase(teacherId)){
                subjectListByTeacherId.add(String.valueOf(InfoCreat.teacherRegistrations.get(i).getCategorySubjectId()));
            }
        }
        System.out.println("아이디가 ["+teacherId +"]인 선생님이 하고 있는 강의과목 목록은 : "
                +Arrays.toString(subjectListByTeacherId.toArray())+" 입니다");
    }

    public boolean creatReply(Reply reply){

        for (int i = 0; i < InfoCreat.freeBoards.size(); i++) {
            if (InfoCreat.freeBoards.get(i).getFreeBoardId()==reply.getFreeBoardId()){
                FreeBoard freeBoard =InfoCreat.freeBoards.get(i);
                freeBoard.setReplies(reply);
                InfoCreat.replyArrayList.add(reply);
                return true;
            }

        }
        return false;
    }
    /*
    InfoCreat.replyArrayList = new ArrayList<>();
        if(creatReply(reply)){
        InfoCreat.replyArrayList.add(reply);
    }
    */



//    public void addReview(){
//    boolean canAddReview = false;
//    canAddReview = canAddReview("K123", CategorySubjectId.KOR1, CategoryRating.STAR10,"좋은 강의였어요");
//    // void가 아닌 리턴형이 있는 메소드는 활용범위가 넓음. 예를 들어,
//    // canAddReview의 true/false 여부에 따라 유저에게 상태 알림을 보낼 수 있음
//    canAddReview = createReview("hero11", 2, 10, "아주 좋았어요2");
//    canAddReview = createReview("nice", 3, 6, "보통이에요");
}
