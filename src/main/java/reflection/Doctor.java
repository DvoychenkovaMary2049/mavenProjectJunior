package reflection;

public class Doctor {
    public String name;
    public int age;
    public String specification;
    private Integer salary;

    public Doctor() {
    }

    public Doctor(String name, int age, String specification, Integer salary) {
        this.name = name;
        this.age = age;
        this.specification = specification;
        this.salary = salary;
    }

    public Doctor(String name) {
        this.name = "Влад";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specification='" + specification + '\'' +
                ", salary=" + salary +
                '}';
    }
}
