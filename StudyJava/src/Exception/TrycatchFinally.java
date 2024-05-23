package Exception;

public class TrycatchFinally {
    public static void main(String[]args){


        /*
        // 1. try-catch
        try {
            System.out.println(3/0); // 실행 예외(ArithmeticException)
            System.out.println("프로그램 종료");
        }
        catch (ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다"); // 실행 예외(ArithmeticException)
            System.out.println("프로그램 종료");
        }

        // 2. try-catch-finally
        try {
            System.out.println(3/0);
        }
        catch (ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다");
        }
        finally {
            System.out.println("프로그램 종료");
        }
        */
        // 1. try-catch
        try {
            System.out.println(3/1); // 실행 예외(ArithmeticException)
            int a = Integer.parseInt(("20"));
            int [] arr = {1,2,3,4,5};
            arr[5] = 6;  //ArrayIndexOutOfBoundsException 발생
        } catch (ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다");
        } catch (NumberFormatException e){
            System.out.println("숫자로 변활 할 수 없습니다");
        }catch (NullPointerException e) {
            System.out.println("Null값으로 인한 오류");
        }catch (Exception e){
            System.out.println("예기치 못한 오류로 종료합니다");
        }
        finally {
            System.out.println("프로그램 종료");
        }



    }
}
