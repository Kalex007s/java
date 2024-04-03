package Lambda;

interface IntCalculator {
    int calculate(int a, int b);
}

public class LambdaExample1 {
    public static void main(String[] args) {
        // calculate 함수의 정의 = 두개의 매개변수의 덧셈
        IntCalculator adder = (a,b) -> a + b;
        int result = adder.calculate(5,3);
        System.out.println(result);

        //내부코드를 바꾸지 않고 입력에 따라 출력값이 변동될 수 있도록
        //람다식을 이용하여 만들 수 있다 = 람다식의 효율성 극대화
        printResult(4,6,(x,y)->x*y*10);
        printResult(7,8,(x,y)->x*y/10);
    }
    //옛날방법
//    public static void printResult(int x, int y, String str){
//        if (str.equalsIgnoreCase("plus")) {
//            System.out.println(x+y);
//        }
//    }
    public static void printResult(int x, int y, IntCalculator calculator){
        System.out.println("Result : "+ calculator.calculate(x,y));


    }
}

