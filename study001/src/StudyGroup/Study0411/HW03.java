package StudyGroup.Study0411;
/*
1) 1부터 100까지의 숫자 중 2의 배수이며 5의 배수인 숫자를 한줄로 출력하고(','또는 띄어쓰기로 숫가끼리의 구분 필요),
   그 숫자들의 총 갯수와
   for문의 총 반복 횟수를 출력하는 코드를 작성하시오.
 */
public class HW03 {
    public static void main(String[] args) {
        int i, count = 0;
        for (i = 1;i <= 100; i++) {
            if (i%2 == 0){
                if(i%5==0){
                    System.out.print(i+" ");
                    count++;
                }
            }
        }
        System.out.println(); // 띄어쓰기
        System.out.println("출력된 숫자들의 갯수 : " + count );
        System.out.println("for문의 반복 횟수 : "+ i );
    }
}
