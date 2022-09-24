package objectorientedjava;

/**
 * InnerAbstractpen
 */
abstract class Pen {

    abstract void write();
    abstract void refill();
}


class FountainPen extends Pen {

    public void nib()
    {
        System.out.println("This is nib() from fountainpen class");
    }
    @Override
    void write() {
        System.out.println("This is write() from pen class");
    }
    @Override
    void refill() {
        System.out.println("This is refill() from pen class");
    }
}
public class Abstractpen {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.nib();
    }
}
