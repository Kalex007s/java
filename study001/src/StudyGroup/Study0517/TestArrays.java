package StudyGroup.Study0517;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrays {
    /*
{88,45,22,12,71,41,34,57,41} 값을 저장하고 있는 배열이 있다.
다음을 나타내시오.
1. 총 합
2. 짝수 숫자들의 합
3. 홀 수만 뽑아 저장한 새로운 배열
 */
    public static void main(String[] args) {
        int[] a = {88,45,22,12,71,41,34,57,41};

        TestArrayOutClass testArrayOutClass = new TestArrayOutClass();
//        1. 총 합
        int q1 = testArrayOutClass.totalSumArrayIndex(a);
//        2. 짝수 숫자들의 합
        int q2 = testArrayOutClass.totalSumArrayIndexByEven(a);
//        3. 홀 수만 뽑아 저장한 새로운 배열
        ArrayList<Integer> q3 = testArrayOutClass.makeNewArrayByOddNumber(a);

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }
}
