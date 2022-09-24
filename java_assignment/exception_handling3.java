public class exception_handling3 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[10] = 50;
        } catch (Exception e) {
            System.out.println("The exception is: "+e);
        }
        System.out.println("Rest of the code...");
    }
}
