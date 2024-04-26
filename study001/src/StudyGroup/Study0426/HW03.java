package StudyGroup.Study0426;
//구구단 8단의 코드를 작성하시오.
//출력 예시 :
//8 * 1 = 8
//8 * 2 - 16
// ...
public class HW03 {
    public static void main(String[] args) {
        int num = 8;
        int length = 9;
        System.out.println(num+"단");
        for (int i = 1; i <= length; i++) {
            System.out.println(num + " * " + (i) + " = " + (num*i));
        }
    }
}
