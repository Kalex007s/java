package StudyGroup.Study0418;
/*
{88,45,22,12,71,41,34,57,41} 값을 저장하고 있는 배열이 있다.
다음을 나타내시오.
1. 총 합
2. 짝수 숫자들의 합
3. 홀 수만 뽑아 저장한 새로운 배열
 */
import java.util.Arrays;
public class HW02 {
    public static void main(String[] args) {
        int c = 0;
        int[] a = {88,45,22,12,71,41,34,57,41};
        int[] f = new int[a.length];
        int totalSum = 0;
        int sum2 = 0;

        for (int i = 0; i < a.length; i++) {
            totalSum = totalSum + a[i];
        }
        System.out.println("총합 : "+totalSum);

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                sum2 = sum2+ a[i];
            }
        }
        System.out.println("짝수 합 : "+sum2);

        for (int i = 0; i < f.length; i++) {
            if (a[i]%2 != 0){
                f[c++] = a[i];
            }
        }System.out.println("홀수 배열 : "+ Arrays.toString(f));


    }
}
