package Entity;

import Entity.Enum.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreat {

    static ArrayList<User> users;
    static ArrayList<Subject> subjects;
    static ArrayList<SubjectRegistration> subjectRegistrations;
    static ArrayList<Review> reviews;
    static ArrayList<TeacherRegistration> teacherRegistrations;
    static ArrayList<FreeBoard> freeBoards;
    static ArrayList<Reply> replyArrayList;

    public static void createInfo() {
        users = new ArrayList<>();
        users.add(new User("돌쇠","K123",LocalDate.of(1999,8,5),
                "010-8888-8888",26,"dd@naver.com",CategoryUserGender.MALE));
        users.add(new User("마당쇠", "K456", LocalDate.of(1997, 3, 25),
                "010-0000-1111", 28, "mm@naver.com", CategoryUserGender.MALE));
        users.add(new User("춘향", "K987", LocalDate.of(2000, 8, 16),
                "010-1234-0000", 25, "chch@naver.com", CategoryUserGender.FEMALE));
        users.add(new User("신데렐라", "K654", LocalDate.of(2002, 6, 7),
                "010-0808-0202", 23, "ss@naver.com", CategoryUserGender.FEMALE));

        subjects = new ArrayList<>();
        subjects.add(new Subject(CategorySubject.KOR, CategorySubjectId.KOR1, CategoryTotalStudents.PASSIBLE100,
                CategoryLevel.HIGHT, CategorySubjectLocation.DAEJEON));
        subjects.add(new Subject(CategorySubject.MAT,CategorySubjectId.MAT2,CategoryTotalStudents.PASSIBLE200,
                CategoryLevel.MIDDLE,CategorySubjectLocation.DAEJEON));
        subjects.add(new Subject(CategorySubject.SCI,CategorySubjectId.SCI3,CategoryTotalStudents.PASSIBLE150,
                CategoryLevel.LOW,CategorySubjectLocation.SEOUL));
        subjects.add(new Subject(CategorySubject.SOC,CategorySubjectId.SCI3,CategoryTotalStudents.PASSIBLE250,
                CategoryLevel.LOW,CategorySubjectLocation.SEOUL));

        subjectRegistrations = new ArrayList<>();
        subjectRegistrations.add(new SubjectRegistration("K123","KOR1"));
        subjectRegistrations.add(new SubjectRegistration("K456", "MAT2"));
        subjectRegistrations.add(new SubjectRegistration("K987", "SCI3"));
        subjectRegistrations.add(new SubjectRegistration("K654", "SCI3"));

        reviews = new ArrayList<>();
//        reviews.add(new Review(1,"K123",CategorySubjectId.KOR1,CategoryRating.STAR10,"좋은 강의였어요"));
//        reviews.add(new Review(2,"K456",CategorySubjectId.MAT2,CategoryRating.STAR2,"수업이 너무 어려웠어요"));
//        reviews.add(new Review(3,"K987",CategorySubjectId.KOR1,CategoryRating.STAR10,"좋은 강의였어요"));

        teacherRegistrations = new ArrayList<>();
        teacherRegistrations.add(new TeacherRegistration("TeacherNo01",CategorySubjectId.KOR1));
        teacherRegistrations.add(new TeacherRegistration("TeacherNo01",CategorySubjectId.SCI3));
        teacherRegistrations.add(new TeacherRegistration("TeacherNo02",CategorySubjectId.MAT2));

        freeBoards = new ArrayList<>();
        freeBoards.add(new FreeBoard(1,"강의1","첫번째 강의 내용은 List입니다.","admin01"));
        freeBoards.add(new FreeBoard(2,"강의2","두번째 강의 내용은 Set입니다.","admin03"));
        freeBoards.add(new FreeBoard(3,"휴강","4월 10일은 국회위원 선거로 휴강입니다","admin02"));
        freeBoards.add(new FreeBoard(4,"강의3","세번째 강의 내용은 Map입니다.","admin01"));

        replyArrayList = new ArrayList<>();
    }
}
