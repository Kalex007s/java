package StudyGroup.Study0430;

import javax.swing.*;
import java.util.Arrays;

/* 참고자료 0430(1) 파일 참고해서 코드 작성

1.정방 배열 만들기
2.비정방 베열 만들기

 */
public class Example01 {
    public static void main(String[] args) {

        int[][] array1 = new int[4][10];
        //1번
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0, k = 11; j < array1[i].length; j++) {
                if (i == 0) {
                    array1[i][j] = j + 1;
                } else if (i == 1) {
                    array1[i][j] = (j + 1) * 10;
                } else if (i == 2) {
                    array1[i][j] = k - 1;
                    k = k - 1;
                } else {
                    array1[i][j] = (j + 1) * 2;
                }
            }
            System.out.println(Arrays.toString(array1[i]));
        }
        //2번
        int[][] array2 = new int[4][];
        for (int i = 0, k = 11; i < array2.length; i++) {
            if (i == 0) {
                array2[i] = new int[10];
                for (int j = 0; j < 10; j++) {
                    array2[i][j] = j + 1;
                } System.out.println(Arrays.toString(array2[i]));
            } else if (i == 1) {
                array2[i] = new int[4];
                for (int j = 0; j < 4; j++) {
                    array2[i][j] = (j + 1) * 10;
                }System.out.println(Arrays.toString(array2[i]));
            } else if (i == 2) {
                array2[i] = new int[6];
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] = k - 1;
                    k = k - 1;
                }System.out.println(Arrays.toString(array2[i]));
            } else {
                array2[i] = new int[3];
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] = (j + 1) * 2;
                } System.out.println(Arrays.toString(array2[i]));
            }
        }
    }
}
