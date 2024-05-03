package StudyGroup.Study0502;
//[배열의 최대값과 최소값 찾기]
//배열의 최대값과 최소값을 찾는 프로그램을 작성하시오.
public class Example01 {
    public static void main(String[] args) {
        int [] array = {100,40,54,54,18,74,59,6,74};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}
