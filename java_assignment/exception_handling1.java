public class exception_handling1 {
    public static void main(String[] args) {
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code...");
    }
}
