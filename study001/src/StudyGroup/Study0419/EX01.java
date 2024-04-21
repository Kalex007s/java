package StudyGroup.Study0419;

import java.util.Arrays;
import java.util.Scanner;

//A배열과 B배열을 만들고
//A배열에는 {1,2,3,4,5,6,7,8,9,10}을 저장하고
//B배열에는 유저에게 1부터 20까지의 숫자 중 5개의 숫자를 입력받은 뒤
//A배열에 유저에게 입력받은 값과 같은 수가 몇개 있는지 세고,
// 그 숫자들을 출력해서 보여주는 코드를 작성하시오.
public class EX01 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        int [] b = new int [5];
        int [] same = new int [5];
        int sameIndex = 0;
        System.out.println("1부터 20개까지 중 5개의 숫자를 입력하시오");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
            for (int j = 0; j < a.length; j++) {
                if(b[i] ==a[j]){
                    same[sameIndex] = a[j];
                    sameIndex++;
                }
            }
        }
        System.out.println("입력하신 숫자는 : "+ Arrays.toString(b) +" 이며\n" +
                "a배열이 가지고 있는 수와 중복되는 숫자는 " +Arrays.toString(same)+" 이고,\n" +
                "중복된 숫자는 총 "+sameIndex+" 개 입니다.");
    }

}
