package StudyGroup.Study0517;

import java.util.Scanner;

class SumNum {

    public int sumTwoNum(int input, int input2) {
        int sum = input + input2;
        return sum;
    }

    public int subTwoNum(int input, int input2) {
        int sub = input - input2;
        return sub;
    }

    public int numTwoNum(int a, int b) {
        int num = a + b;
        return num;
    }

    public class Main {
        public static void main(String[] args) {
            //사용자에게 두 개의 숫자를 입력받아 다음을 수행하는 메서드를 만드시오.
            //단 외부 클래스를 사용해야 함. -> 새로운 file 이용
            //1. 두 수를 더하는 메서드를 만드시오.
            //2. 두 수를 빼는 메서드를 만드시오.
            //3. 1과 2를 더하는 메서드를 만드시오.
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            int input2 = sc.nextInt();

            SumNum sum1 = new SumNum();

            System.out.println(sum1.sumTwoNum(input, input2));
            System.out.println(sum1.subTwoNum(input, input2));
            int a = sum1.sumTwoNum(input, input2);
            int b = sum1.subTwoNum(input, input2);

            System.out.println(sum1.numTwoNum(a, b));
        }
    }
}