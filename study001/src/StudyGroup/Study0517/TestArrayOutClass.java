package StudyGroup.Study0517;

import java.util.*;

public class TestArrayOutClass {


    public int totalSumArrayIndex(int [] array) {
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            totalSum = totalSum + array[i];
        }
        return totalSum;
    }

    public int totalSumArrayIndexByEven(int [] array) {
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                totalSum += array[i];
            }
        }
        return totalSum;
    }

    public ArrayList<Integer> makeNewArrayByOddNumber(int [] array) {
        ArrayList<Integer> oddArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray.add(array[i]);
            }
        }
        //ArrayList 클래스의 배열을 정렬하기 위해서는 ArrayList 의 메서드 sort 가 아닌,
        //Collections 클래스의 매서드 sort 를 사용해야 한다.
        Collections.sort(oddArray);
        return oddArray;
    }
}
