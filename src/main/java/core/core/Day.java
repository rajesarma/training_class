package core.core;

public enum Day {
    SUNDAY(0, 1),
    MONDAY(3,3),
    TUESDAY(1,4),
    WEDNESDAY(6,5),
    THURSDAY(5,2),
    FRIDAY(4,3),
    SATURDAY(2,4);

    private int num1;
    private int num2;

    Day(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }


}
