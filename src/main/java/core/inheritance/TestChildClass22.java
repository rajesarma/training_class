package core.inheritance;

public class TestChildClass22 extends TestClass22 {

    void test() {
        System.out.println(super.task2());
    }

    public static void main(String[] args) {

        TestChildClass22 testChildClass22 = new TestChildClass22();
        System.out.println(testChildClass22.task2());

        testChildClass22.test();
    }
}
