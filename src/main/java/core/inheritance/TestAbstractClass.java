package core.inheritance;

public abstract class TestAbstractClass implements testInterface1 {
    @Override
    public long task() {
        return 123;
    }

    public abstract long task1();
}
