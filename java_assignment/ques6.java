package java_assignment;
abstract class pen {
    abstract void write();
    abstract void refill();
}
class fountain_pen extends pen {

    @Override
    void write() {
        System.out.println("It is the write method");
    }
    @Override
    void refill(){
        System.out.println("It is the refill method");
    }
    void nib(){
        System.out.println("It is the nib method");
    }
}
public class ques6 {
    public static void main(String[] args) {
        fountain_pen fp = new fountain_pen();
        fp.write();
        fp.refill();
        fp.nib();
    }
}
