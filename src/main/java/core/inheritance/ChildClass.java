package core.inheritance;

public class ChildClass extends TestClass3 {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();

        childClass.task2();
        System.out.println(childClass.task());
    }
}
