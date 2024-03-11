import java.util.Arrays;

public class Study20240311 {
    /*    public static void main(String[] args) {
            int[] array = new int[]{1, 2, 3};
            modifyData(array);
            printArray(array);
        }

        public static void modifyData(int[] a) {
            a[0] = 4;
            a[1] = 5;
            a[2] = 6;
        }

        public static void printArray(int[] a) {
            System.out.println(Arrays.toString(a));
        }
    }*/
    static int a = 1;
    static int b = 2;

    public static void main(String[] args) {
        System.out.println(plusNums());
        System.out.println(plusNums(4, 5));
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(plusNums(intArray));
        System.out.println(plusNums(1,2,3,4,5,6));
    }

    //1.메소드의 오버로딩 ([tes]/[면접시 질문 많이 함] 오버로딩이 무엇인가)
    //하나의 메소드 이름으로 여러가지 일을 처리 할 수 있으면 효율성 띌 수 있다. 매개변수가 다르다는 가정하에 효율성을 극대화 = 편리성 up!
    // 똑같은 이름의 메소드가 있음에도 에러가 나지 않는 이유 : 시그니처가 다르기 때문에 => 시그니처를 따라감
    // == println을 중복사용 했을때 오류가 나지 않음.
    // 어떨때 사용? =>
    // 메소드의 기본문법 - 메소드를 만났을때 워프
    public static  int plusNums() {
        return a + b;
    }
    public static int plusNums(int x, int y) {
        return x + y;
    }
    public static int plusNums(int[] intArray, int length) { //선언을 하지 않았으므로 초기화 됌 = 0값
        int sum = 0;
        for (int i=0; i< intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum;
    }
    //가변 길이 배열이 필요한 이유
    /*public static int plusNums(int a,int b,int c, int d, int e) {
        return a + b + c + d + e;

    }
    public static int plusNums(int a,int b,int c, int d, int e, int f) {
        return a + b + c + d + e + f;
    }*/
    //복잡하니까 가변으로 만들자
    public static int plusNums(int... values){
        int sum =0;
        for(int i=0; i<values.length; i++){
            sum = sum + values[i];
        }
        return sum;

    }
}