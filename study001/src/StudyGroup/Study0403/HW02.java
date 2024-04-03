package StudyGroup.Study0403;


import java.util.Arrays;

//ArrayBirthDay 라는 배열 하나로
//1.   1,2,3,4,5,6,7,8,9,10
//2.   10,20,30,40,50,60,70,80,90,100
//3.   15,25,35,45,55,65,75,85,95,105
//4.   99,99,99,99,99,99,99,99,99,99
//를 출력하시오.
public class HW02 {
    public static void main(String[] args) {
        int [] ArrayBirthDay = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(ArrayBirthDay));
        for(int i=0;i< ArrayBirthDay.length;i++){
            ArrayBirthDay[i] = ArrayBirthDay[i]*10;
        }
        System.out.println(Arrays.toString(ArrayBirthDay));

        for(int i=0;i< ArrayBirthDay.length;i++){
            ArrayBirthDay[i] = ArrayBirthDay[i]+5;
        }
        System.out.println(Arrays.toString(ArrayBirthDay));

        for(int i=0;i< ArrayBirthDay.length;i++){
            ArrayBirthDay[i] = 99;
        }
        System.out.println(Arrays.toString(ArrayBirthDay));
    }
}
