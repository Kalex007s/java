package Entity;

import Entity.Enum.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreat {

    static ArrayList<User> users;
    static ArrayList<Subject> subjects;
    static ArrayList<SubjectRegistration> subjectRegistrations;

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
    }
}
