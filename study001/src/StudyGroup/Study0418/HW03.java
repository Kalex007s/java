package StudyGroup.Study0418;
import java.util.Arrays;
import java.util.Scanner;

//{1,8,5,9,4,6,3,7,2,10}를 담고 있는 배열이 있다
//사용자가 1부터 10까지의 숫자 중 하나를 입력하였을때 그 값이 몇번째 인덱스에 있는지 알아내는 코드를 작성하시오.
public class HW03 {
    public static void main(String[] args) {

        int[] a = new int[]{1, 8, 5, 9, 4, 6, 3, 7, 2, 10};

        Scanner scn = new Scanner(System.in);
        System.out.println("1~10까지의 숫자 중 하나를 입력해주세요 : ");
        int input = scn.nextInt();

        for (int i = 0; i < a.length; i++) {
            if ( a[i] ==  input) {
                System.out.println(i);
            }
        }
    }
}
