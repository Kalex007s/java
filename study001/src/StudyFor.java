public class StudyFor {
    public static void main(String[]args) {

        /*
        //초기식은 보통 정수형을 사용
        //컴퓨터 카운터는 0부터
        //초기식은 카운터 역활
        //조건식은 true인 동안은 작동 -> fuals가 되면 동작을 멈춤
        //증감식은 실행코드 다음에 실행됨
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //무한루프(시스템 다운의 이유가 되기도 함)
        //조건식이 false가 될 수 있는지 여부를 반드시 확인!!
/*        for (int i = 0;  i >= 0; i++){
            System.out.println(i);
        }*/

        /*
        int a;
        for(a = 0; a <3; a++) {
            System.out.println(a);
        }
        System.out.println();

        for(int i=0; i<3; i++){
            System.out.println(i + "");
        }
        System.out.println();

        for(int i = 0; i <100; i++) {
            System.out.println(i + "");
        }
        System.out.println();


        for(int i=10; i >0; i--) {
            System.out.println(i + "");
        }
        System.out.println();
        for (int i =0; i <10; i+=2){
            System.out.println(i +"");
        }
        System.out.println();
        for(int i = 0, j = 0; i<10; i++,j++) {
            System.out.println(i+j+"");
        }
        System.out.println();

        //for문의 특수한 형태(무한루프)
        /*
        for(int i=0; ; i++){
        System.out.print(i+"");
        }
        for(;;) {
        System.out.print("무한루프");
        }
        */
        /*
        System.out.println();

        //무한루프 탈출
        for(int i=0; ; i++){
            if(i>10) {
                break;
            }
            System.out.print(i+"");
        }
        System.out.print("무한 루프 탈출");
        */

        //for문 변형하기
        for(int i=0; i<5; i++){
            System.out.println(i +"");
        }
        int i = 0;
        //변수 선언을 미리했더라도 초기식 자리를 유지해야함
        //이유는 초기식이 없을 경우 조건식을 초기식으로 인식 (증감식 동일)
        for(; i<5; ){
            System.out.println(i +"");
            i++;
        }
        int a = 0;
        for(; ; ){
            //조건식 위치변경시 조건문 사용
            if(a < 5){
                System.out.println(a +"");
                a++;
            }else {
                break;
            }
        }
        //멀티 조건식
        for(int b=0,c=0; b<5 || c<5; b++, c++) {
            System.out.print(b + "_"+c+" ");
        }
    }
}



















