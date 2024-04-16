package StudyGroup.Study0416;


/*

 0   2   10
 1   4   9
 2   6   8
 3   8   7
 4   10  6
 5   12  5
 6   14  4
 7   16  3
 8   18  2
 9   20  1
10   22  0

 */



public class HW02 {
    public static void main(String[] args) {
        for (int i = 0, j = 0, k = 11; i <= 10; i++) {
            j = j + 2;
            k = k - 1;
            System.out.println(i + " " + j + " " + k);
        }

/*        int i = 0;
        int j = 0;
        int k = 10;
        int num = 0;
        for (; i <= 10; i++) {
            for (; j <= 10; j++) {
                num = num+2;
                for (; k >= 0; k--) {
                    System.out.println(i+" "+num+" "+k);
                    k--;
                    break;
                }
                break;
            }
        }*/

    }
}