package Lambda;

import java.util.Arrays;

interface AC{
    int[] methodAc(int length);
}
public class ArrayCounstructor {
    public static void main(String[] args) {
        //함수형 인터페이스 메서드가 입력된 갯수만큼의 정수 배열을 리턴하는 경우
        AC a0 = new AC() { //익명이너클래스 형태
            @Override
            public int[] methodAc(int length) {
                return new int[length];
            }
        };
        AC a1 = (int length) -> {return new int[length]; };
        AC a3 = (int length) -> new int[length]; //리턴과 중괄호 생략 가능
        AC a2 = int[]::new;

        int[] array1 = a2.methodAc(10);
        System.out.println(array1.length);
        int[] array2 = a2.methodAc(20);
        System.out.println(array2.length);
        System.out.println(Arrays.toString(array1));
    }
}
