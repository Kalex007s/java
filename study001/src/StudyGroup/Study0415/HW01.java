package StudyGroup.Study0415;


import java.util.Scanner;

/*
사용자가 입력한 값을 찾는 코드를 완성하시오.
 */
public class HW01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        for (int i=0; ;i++){
            if(i==userNum){
                System.out.println("유저가 입력한 값은 [ " + i + " ] 입니다.");
                break;
            }
        }
    }
}