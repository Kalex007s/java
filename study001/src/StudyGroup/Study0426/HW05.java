package StudyGroup.Study0426;

import Entity.InfoCreat;

import java.util.Scanner;

//각 배열의 크기는 100으로 하며,
//a배열에는 1부터 100까지, b배열에는 101부터 200까지, c배열에는 201부터 300까지의 숫자를 저장한다.
//유저에게 값을 입력 받은 뒤 그 배열의 값이 어느배열에 몇번째 인덱스번호에 저장되어있는지를 출력하시오.
public class HW05 {
    public static void main(String[] args) {
        int size = 100;
        int [] a = new int[size];
        int [] b = new int[size];
        int [] c = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
            b[i] = a[i]+size;
            c[i] = b[i]+size;
        }
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();;
        if (input > 0 && input <= 100){
            for (int i = 0; i < a.length; i++) {
                if (a[i] == input){
                    System.out.println("a 배열,"+ i + "인덱스");
                }
            }
        } else if (input > 100 && input <= 200) {
            for (int i = 0; i < b.length; i++) {
                if (b[i] == input){
                    System.out.println("b 배열,"+ i + "인덱스");
                }
            }
        } else if (input > 200 && input <= 300) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] == input){
                    System.out.println("c 배열,"+ i + "인덱스");
                }
            }
        } else {
            System.out.println("error");
        }
    }
}
