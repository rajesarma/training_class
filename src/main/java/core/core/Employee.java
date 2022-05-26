package core.core;

public class Employee {

    private Long id;
    private String name;
    private Integer age;

    public Employee() {
        System.out.println("I am in default Constructor");
    }

    public Employee(Long idx, String namex) {
        this.id = idx;
        this.name = namex;

        System.out.println("I am in two parameterized Constructor");
    }

    public Employee(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;

        System.out.println("I am in 3 parameterized Constructor");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
