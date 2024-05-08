package StudyGroup.Study0506;


import java.util.Arrays;
import java.util.Random;

//array[54,87,14,25,97,5,41,4,247,85,41,365]
//위 배열을 작은 수부터 큰 순으로 정렬하시오.
//문제 1. 프로그램을 설계하시오.
//문제 2. 정렬된 배열과 최소,최대 값 그리고 최소값부터 값을 차례대로 더했을때 최대값 이상으로 값이 커지는 인덱스를 구한 뒤 출력하시오.
public class HW01 {
    public static void main(String[] args) {
        int[] array = {54,87,14,25,97,5,41,4,247,85,41,365};
        //정렬
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[i] > array[j]) {
                    int pocket = array[j];
                    array[j] = array[i];
                    array[i] = pocket;
                }
            }
        }

        //최소값부터 값을 차례대로 더했을때 최대값 이상으로 값이 커지는 인덱스 구하기
        int sum = 0;
        int saveIndex = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if ( sum > array[11]){
                saveIndex = i;
                break;
            }
        }
        System.out.println("정렬된 배열 : "+ Arrays.toString(array));
        System.out.println("최소값 : "+array[0]);
        System.out.println("최대값 : "+array[11]);
        System.out.println("최소값부터 값을 차례대로 더했을때 최대값 이상으로 값이 커지는 인덱스 : " + saveIndex);

    }
}