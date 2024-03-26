package JavaInterface;

import JavaInterface.A;
import JavaInterface.B;

public class ChildA implements A, B {
    @Override
    public void abc(){
        System.out.println("Child Of A");
    }

    @Override
    public void bcd() {
        System.out.println("Child of B");
    }
}
