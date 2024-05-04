package StudyGroup.Study0503;

import java.util.Arrays;

/*
문제3. 두 개의 배열을 하나의 배열로 합치시오.
[1,2,3,4,5,6,7,8,9,10]
[가,나,다,라,마,바,사,아,자,차]
결과 : [1,가,2,나,3,다 …9,자,10,차]
 */
public class HW03 {
    public static void main(String[] args) {
        String [] array1 = {"1","2","3","4","5","6","7","8","9","10"};
        String [] array2 = {"가","나","다","라","마","바","사","아","자","차"};
        String [] array3 = new String[array1.length + array2.length];
        int array1Index = 0;
        int array2Index = 0;
        for (int i = 0; i < array3.length; i++) {
            if(i % 2 == 0) {
                array3[i] = array2[array1Index];
                array1Index++;
            } else {
                array3[i] = array1[array2Index];
                array2Index++;
            }
        }
        System.out.println(Arrays.toString(array3));
    }
}
