public class StudyContinue {
    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            if(i%2 == 1){ // 홀수인 경우 아래 출력문을 실행하지 않음
                continue;
            }
            System.out.println(i);
        }
        //이중for문에서의 continue
        for (int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(j==3){
                    continue; // j가 3일때 출력을 하지 않고 다음 4로 넘어가서 출력함 /만약 break였다면 2 출력후 탈출
                }
                System.out.println(i + "," + j);
            }
        }
        for (int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(j==3){
                    continue;
                }
                if(i==3){
                    continue;
                }
                System.out.println(i + "," + j);
            }
        }
    }
}
