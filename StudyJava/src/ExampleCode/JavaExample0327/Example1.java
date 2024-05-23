package ExampleCode.JavaExample0327;

public class Example1 {

    public static void main(String[] args) {
        // 문제 1. 아래 2차원 배열의 모든 값의 합과 평균을 구하시오
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float average = 0;
        float num = 0;
        for(int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total = total + arr[i][j];
            }
            num = num + arr[i].length;
        }
        average = total / num;
        System.out.println("total="+ total ); // 325
        System.out.println("average="+average); // 16.25


        //int totalArr = arr[0].length + arr[1].length + arr[2].length + arr[3].length;
        //average = (float) total / totalArr;
        //System.out.println("total="+ total ); // 325
        //System.out.println("average="+average); // 16.25
    }
}
/*for(int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total = total + arr[i][j];

            }

        }
        average = (float) total / ((arr.length * arr[0].length));*/

        /*int total = calculateTotal(arr);
        float average = calculateAverage(arr, total);

        System.out.println("total=" + total); // 325
        System.out.println("average=" + average); // 16.25
    }

    public static int calculateTotal(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        return total;
    }

    public static float calculateAverage(int[][] arr, int total) {
        int totalArr = 0;
        for (int i = 0; i < arr.length; i++) {
            totalArr += arr[i].length;
        }
        return (float) total / totalArr;
    }
}*/