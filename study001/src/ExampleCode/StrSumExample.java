package ExampleCode;

import java.sql.Array;

public class StrSumExample {
    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";
        int num = Integer.parseInt(str);
        System.out.println(num);
        int sum = 0;
        while(num > 0) {
            sum = sum +  num%10;
            num =  sum / 10;
        }
        System.out.println("합계는"+sum); // 15
    }
}

