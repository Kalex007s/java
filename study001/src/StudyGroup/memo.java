package StudyGroup;
class A {
    public int addNum(int a, int b) {
        return a + b;
    }

    public void printHello() {
        System.out.println("Hello, World!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public void saveData(String data) {
        String database = data;
    }
    public String getGreeting(String name) {
        return "Hello, " + name + "!";
    }

    public static void println() {
        System.out.println("데이터가 없습니다.");
    }

    public static void println(int a) {
        System.out.println(a);
    }
}
public class memo {
    public static void main(String[] args) {
        A a = new A();
        int result = a.addNum(3,5);
        System.out.println(result);

        a.saveData("example data");
        String result2 = a.getGreeting("alex");
        System.out.println(result2);
    }
}
