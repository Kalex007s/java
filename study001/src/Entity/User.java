package Entity;

import Entity.Enum.CategoryUserGender;

import java.time.LocalDate;

public class User {

    private String userID;
    private int userProfilePicture;
    private LocalDate dataOfBirth;
    private String phoneNumber;
    private int age;
    private String dataJoin;
    private String emailAddress;
    private String userPassword;
    private String address;
    CategoryUserGender categoryUserGender;
    private String name;
    private String permissionLevel;
    private String languagePreference;
    private String notificationPreferences;
    private String userLevel;

    public User() {
    }

    public User(String name,String userID, LocalDate dataOfBirth, String phoneNumber, int age, String emailAddress,
                CategoryUserGender categoryUserGender) {
        this.userID = userID;
        this.dataOfBirth = dataOfBirth;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.emailAddress = emailAddress;
        this.categoryUserGender = categoryUserGender;
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getUserProfilePicture() {
        return userProfilePicture;
    }

    public void setUserProfilePicture(int userProfilePicture) {
        this.userProfilePicture = userProfilePicture;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDataJoin() {
        return dataJoin;
    }

    public void setDataJoin(String dataJoin) {
        this.dataJoin = dataJoin;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CategoryUserGender getCategoryUserGender() {
        return categoryUserGender;
    }

    public void setCategoryUserGender(CategoryUserGender categoryUserGender) {
        this.categoryUserGender = categoryUserGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public String getLanguagePreference() {
        return languagePreference;
    }

    public void setLanguagePreference(String languagePreference) {
        this.languagePreference = languagePreference;
    }

    public String getNotificationPreferences() {
        return notificationPreferences;
    }

    public void setNotificationPreferences(String notificationPreferences) {
        this.notificationPreferences = notificationPreferences;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }


    @Override
    public String toString() {
        return "User Info:: 이름: "+name+"/ 성별: "+categoryUserGender+"생년월일 : "+dataOfBirth+
        userID+"/ 나이: "+age+"/ 유저아이디: "+userID+"/ 핸드폰번호: "+phoneNumber+"/ 이메일: "+emailAddress;
    }
}
