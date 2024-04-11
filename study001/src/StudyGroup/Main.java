package StudyGroup;

public class Main {
    public static void main(String[] args) {
        int conut = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2==0 && i%5==0){
                conut++;
                System.out.print(i+", ");
            }
        }System.out.println();
        System.out.println("총 반복 횟수는 : " + conut);
    }
}
