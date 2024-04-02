package StudyGroup.Study0402;


//아래 정수형 배열에서 짝수인 요소들의 합을 계산하여 출력하는 프로그램을 작성하시오.
public class HW03 {
    public static void main(String[] args) {
        int [] Array = {1,2,3,4,5,6,7,8,9,10};
        //합을 저장할 변수를 선언한다.
        int sum = 0;
        //배열 안에 있는 수 중 짝수인 수를 찾고 그 수를 더하는 코드를 작성한다.
        for (int i=0;i< Array.length;i++){
            if (Array[i] % 2 == 0){
                sum = sum + Array[i];
            }
        }
        System.out.println("위 정수형 배열의 요소 중 짝수 요소의 총 합은 : "+sum+"입니다.");

    }
}
