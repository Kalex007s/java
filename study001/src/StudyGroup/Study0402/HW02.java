package StudyGroup.Study0402;

import java.util.Arrays;

//1부터 50까지의 숫자 중 2의 배수 이면서 5의 배수인 숫자만을 담고 있는 배열 만들고, 배열 안에 있는 값을 출력하시오.
public class HW02 {
    public static void main(String[] args) {
        //먼저 배열을 선언해도 되지만 배열의 길이를 알기 힘드므로 연산 후 System.out.println을 통해 갯수 확인 후 배열을 만들겠다.
        int count = 0; // 2의 배수이면서 5의 배수인 수를 세기 위한 변수

        // 1부터 50까지의 수를 반복하여 검사
        for (int i = 1; i <= 50; i++) {
            // 2의 배수이면서 5의 배수인 경우를 찾음
            if (i % 2 == 0 && i % 5 == 0) {
                count++; // 조건을 만족하는 수를 발견하면 count를 증가시킴
            }
        }
        System.out.println("1부터 50까지의 수 중에 2의 배수이면서 5의 배수인 수의 개수: " + count);
        //배열의 길이를 알아냈으니 배열을 만들고 그 안에 들어가는 숫자를 구한다.
        int[]Array = new int[5];
        //배열에 인덱스를 정해줄 변수를 선언한다. 이때 변수를 j로 사용하지 않는 이유는 j는 1~50까지 차례대로 커지지만
        //우린 조건이 충족될 때만 배열의 인덱스 값에 충족하는 수를 넣고 증가하여야 하기 떄문에
        //새로운 변수가 핗요하다.
        int i=0;
        for (int j = 1; j <= 50; j++) {
            // 2의 배수이면서 5의 배수인 경우를 찾음
            if (j % 2 == 0 && j % 5 == 0) {
                Array[i]=j;
                //i번째 인덱스를 사용 했으므로 다음 인덱스 번호로 넘어가기 위해 인덱스를 +1 해준다.
                i++;
            }
        }
        System.out.println("배열 속 인덱스 값은 각각 : "+Arrays.toString(Array));
    }
}
