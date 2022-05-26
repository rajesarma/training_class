package core.inheritance;

public interface multiInterface2 {
    public abstract long mul1();

    default String mul() {
        System.out.println("In Interface 1");

        return "In Interface 1";
    }
}
