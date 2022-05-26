package core.core;

public class EmpDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setId(1L);
        emp1.setName("Raj");

        System.out.println(emp1);


        Employee emp2 = new Employee();

        emp2.setId(1L);
        emp2.setName("Raj");
        System.out.println(emp2);

        Employee emp3 = new Employee(2L, "Raj");
        emp3.setAge(20);
        System.out.println(emp3);


        Employee emp4 = new Employee(2L, "Raj", 26);
        System.out.println(emp4);
    }
}
