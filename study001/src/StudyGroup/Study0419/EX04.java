package StudyGroup.Study0419;
// 1부터 10까지의 숫자가 저장되어 있는 배열이 있다.
//  이 배열의 인덱스끼리의 합이 50을 넘어가는 지점의 인덱스 번호를 출력하시오.
public class EX04 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5,6,7,8,9,10};
        int max = 0;
        for (int i = 0; i < array1.length; i++) {
            max = max+array1[i];
            if(max>50){
                System.out.println(i+" 번째 인덱스입니다.");
            }
        }
    }
}
