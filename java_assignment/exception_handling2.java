public class exception_handling2 {
    public static void main(String[] args) {
        System.out.println("Hello world...");
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("The exception is: "+e);
        }
        System.out.println("Rest of the code...");
    }
}
