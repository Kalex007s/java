//이해가 잘 안됌
public class StudyForClassTester {
    public static void main(String[] args) {
        StudyForClass tom = new StudyForClass("Tom",18,"Daejeon","123456");
        StudyForClass steve = new StudyForClass("steve",25,"Seoul","456745");

        //기본생성자
        StudyForClass alex = new StudyForClass();

        /*System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.address);*/

        //기본생자 입력 - 배열과 비슷
        /*alex.name = "Alex";
        alex.age = 26;
        alex.address = "Daejeon";*/
        alex.displayAll();
        System.out.println();
        //getter와 setter
        alex.setName("Alex");
        alex.setAge(26);
        alex.setAddress("Daejeon");
        alex.displayAll();
        System.out.println();

        /*tom.displayName();
        tom.Dsiplayage();
        tom.dsiplayadress();
        tom.displayAll();
        steve.displayName();
        steve.Dsiplayage();
        steve.dsiplayadress();
        steve.displayAll();*/

        tom.displayAll();
        steve.displayAll();
        /*System.out.println(tom.name);*/

        System.out.println(tom.getPersnalNum());
//        tom.persnalNum() = "456453"; 게터세터에서 세터를 없애면 수정이 안됌.

        //메소드 호출
        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int[] numberList2 = {456,255,56456,45645,54564,4153};
        getSumAvg(numberList);
        getSumAvg(numberList2);

    }
   static void getSumAvg(int[]numberList){
        //7.아래 배열의 총합과 평균을 출력
        int sum = 0;
        for (int i=0; i<numberList.length; i++) {
            sum = sum + numberList[i];
        }
        int average = sum / numberList.length;
        System.out.println(sum + " " + average);

    }
}
