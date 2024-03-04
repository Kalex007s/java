public class Studywhile {
    public static void main(String[] args) {
        /*
        int i = 0; //초기식
        while (i < 5) { //조건식
            System.out.print(i + " ");
            i++; //증감식
        }
        //의도적인 무한루프에서 while문은 자주 쓰임
        //while (true){
            //무한루프
            //응용 : 유저가 버튼 클릭할때까지 대기
            // if (esc버튼 클릭)
            //   break;

         */
        // do ~ while 문

   /* int cnt = 0; //초기식
        do{
            System.out.print(cnt + " ");
            cnt++;
        }while (cnt < 5);

    */
// do ~ while 과 while 차이


        int cnt1 = 5;
        do {
            System.out.println(cnt1 + " ");
            cnt1++;
        } while (cnt1 < 5);
        // 아래 while문과 비교하면
        // 반복문의 조건이 처음부터 false인 경우,
        // do ~ while문은 실행코드가 1회 실행되는 반면. while문은 실행되지 않음!!
        int cnt2 = 5;
        while (cnt2 < 5){
            System.out.println(cnt2 + " ");
            cnt2++;
        }

        int a = 5;
        do {
            System.out.println(a + " ");
            a++;
        }while (a < 5);

        int b = 5;
        while (b < 5){
            System.out.println(b + " ");
            b++;
        }

        //2중 루프, 2중 반복문


        /*
            for ( int k = 0; k<3; k++) {
            for (int j=0; j<5; j++) {
                System.out.println("[k=" + k + ", j=" + j + "]");
            }
        }

         */
    }
}
