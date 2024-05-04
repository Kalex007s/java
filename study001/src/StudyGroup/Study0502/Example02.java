package StudyGroup.Study0502;

import java.util.Arrays;

// [배열간 크기비교]
// 두개의 배열을 각 인덱스 별로 비교하여 큰 값을 저장한 새로운 배열을 만들어 출력하시오.
public class Example02 {
    public static void main(String[] args) {
        int [] array1 = new int[]{54,78,96,78,54,12};
        int [] array2 = new int[]{45,78,62,57,48,32};
        int [] array3 = new int[array1.length];
        for (int i = 0; i < array3.length; i++) {
            if (array1[i] >= array2[i]){
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i];
            }
        }
        System.out.println(Arrays.toString(array3));
    }
}
