package StudyGroup.Study0418;

//길이가 5인 배열과 길이가 6인 배열을 만든다.
//0~9까지의 숫자 중 한쪽에는 짝수, 한쪽애는 홀 수가 저장되도록 한다.

import java.util.Arrays;

public class HW01 {
    public static void main(String[] args) {
        int[] oh = new int[5];
        int[] six = new int[6];
        int a = 0;
        int b = 0;

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                oh[a++] = i;
            } else {
                six[b++] = i;
            }
        }
        System.out.println("짝수 : " + Arrays.toString(oh));
        System.out.println("홀수 : " + Arrays.toString(six));
    }
}