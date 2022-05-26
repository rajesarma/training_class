package core.inheritance;

public class MIChild implements multiInterface1, multiInterface2 {

    @Override
    public long mul1() {

        return 103;
    }

    @Override
    public long mul1(int i) {
        return 0;
    }

    @Override
    public String mul() {
        return " test";
    }
}
