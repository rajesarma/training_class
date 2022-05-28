package core.core;

public class StaticDemo {
    public static String ABC = "Test Abc";
    public static int i;

    public StaticDemo () {
        System.out.println("I am in constructor");
        i = 100;
        System.out.println(i);
    }

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();

        System.out.println(i);
        System.out.println("I am in main method");
    }

    static {
        System.out.println(i);
        System.out.println("I am in static block");
        i = 101;
        System.out.println(i);
    }

    public static class Customer {
        private Long customerId;
        private String customerName;
    }
}
