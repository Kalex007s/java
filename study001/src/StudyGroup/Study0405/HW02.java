package StudyGroup.Study0405;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//배열 arrayCheck 에는 1부터 10까지의 숫자가 들어있고
//사용자에게 1부터 10까지 숫자중 임의의 숫자 5개를 입력받는다.(중복 숫자 가능)
//사용자가 입력한 숫자들과 배열 arrayCheck 중 동일한 숫자를 찾고 그 수가 중복 된다면 중복된 횟수를 출력하라.
public class HW02 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        int [] check = new int[5];
        ArrayList<Integer>doubleNum = new ArrayList<>();
        int count = 0;
        for (int i =0;i<5;i++){
            check[i] = scanner.nextInt();
            for (int j = 0; j < array.length; j++) {
                if(check[i]==array[j]){
                  count++;
                  doubleNum.add(check[i]);
                }
            }
        }
        System.out.println("입력하신 숫자는 "+ Arrays.toString(check)+"이며");
        System.out.println("중복된 횟수는"+count+"입니다.");
    }
}

