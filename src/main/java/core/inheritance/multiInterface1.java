package core.inheritance;

public interface multiInterface1 {
    public abstract long mul1(int i);

    default String mul() {
        System.out.println("In Interface 1");

        return "In Interface 1";
    }
}
