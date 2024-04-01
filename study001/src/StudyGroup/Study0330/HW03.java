package StudyGroup.Study0330;


//1~10까지의 숫자가 출력되는 코드를 작성하시오.(변수 선언 10개로 출력금지)
//단, 줄바꿈 없이 1, 2, 3,이런식으로 쉼표까지 출력되야함)

public class HW03 {
    public static void main(String[]args) {
        //변수 선언 - i를 선언한 이유 : for문 밖에서도 사용하기 위함
        int i;
        //1부터10까지라는 반복이 있으므로 반복문을 사용하느 것이 편리하다.
        for (i=0;i<9;i++) {
            //쉼표와 띄어쓰기는 문자임으로 따옴표를 이용하여 출력하였고 숫자와 문자열을 연결 시켜주기위해 +를 사용함
            System.out.print(i+1+", ");
        }
        //마지막 10까지 for 문안에서 출력시 [9,10,] 이런식으로 출력된다. 마지막 숫자 10에 따옴표가 붙는것을 방지하기 위해
        //10이라는 숫자는 for 문 밖에서 출력되도록 하였다.
        System.out.println(i+1);
    }
}