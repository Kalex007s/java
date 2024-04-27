import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 1~300중 적어주세요 : ");
        int input = sc.nextInt();
        int[] a = new int[100];
        int[] b = new int[100];
        int[] c = new int[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i]+i;    // a[i] = i+1; i가 0부터 시작하는데, 배열[]에 i를 더하는게 아닌 배열 안에 i+1 한 값을 대입해서 넣어줘야한다.
            b[i] = 101+i;
            c[i] = 201+i;
            if (input == a[i]){
                System.out.println(i);  //알기 쉽게 s.o.p 안에 ("a배열, "+i+"번째 인덱스") 의 내용을 적어줘야한다.
            }
            else if (input == b[i]){
                System.out.println(i);
            }
            else if (input == c[i]){
                System.out.println(i);
            }
        }
/*      수중이 수정본
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 1~300중 적어주세요 : ");
        int input = sc.nextInt();
        int[] a = new int[100];
        int[] b = new int[100];
        int[] c = new int[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
            b[i] = 101+i;
            c[i] = 201+i;
            if (input == a[i]){
                System.out.println("a배열, "+i+"번째 인덱스");
            }
            else if (input == b[i]){
                System.out.println("b배열, "+i+"번째 인덱스");
            }
            else if (input == c[i]){
                System.out.println("c배열, "+i+"번째 인덱스");
            }
        }*/
    }
}







