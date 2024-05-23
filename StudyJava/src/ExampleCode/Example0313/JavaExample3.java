package ExampleCode.Example0313;

import java.util.Arrays;
import java.util.Scanner;

public class JavaExample3 {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Original array의 값은: "+ Arrays.toString(arr) +" 입니다.\n" +
                "왼쪽으로 이동하고 몇차례 이동을 원하십니까? ");
        int n = sc.nextInt();



        for (int i = 0; i < arr.length; i++) {

        }

        for(int i = 0; i < n; i++){ //3번반복 => 횟수의 반복
            int j, first;

            first = arr[0];  // 포인트 1
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1]; //
            }
            arr[j] = first;  // 포인트 2
        }
        System.out.println();
        System.out.print("원하시는 값은 ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(" 입니다.");
    }
}//순환 구조 로직
/*
public class JavaExample3 {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Original array의 값은: "+ Arrays.toString(arr) +" 입니다.\n" +
                "오른쪽으로 이동을 몇차례 원하십니까? ");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

        }
        for(int i = 0; i < n; i++){ //횟수의 반복
            int j, last;

            last = arr[arr.length-1];  // 포인트 1
            for(j = arr.length-1; j > 0; j--){

                arr[j] = arr[j-1]; //
            }
            arr[0] = last;  // 포인트 2
        }
        System.out.println();
        System.out.print("원하시는 값은 ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(" 입니다.");
    }
}
*/
