public class Teacher {
    private String id;
    private String name;
    private int age;
    private String hometown; // Quê Quán
    private double salary; // Lương
    private double bonus; // Lương thưởng
    private double penaty; // Lương phạt
    

    public Teacher(String id, String name, int age, String hometown, double salary, double bonus, double penaty) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.salary = salary;
        this.bonus = bonus;
        this.penaty = penaty;
    }

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenaty() {
        return penaty;
    }

    public void setPenaty(double penaty) {
        this.penaty = penaty;
    }

    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", age=" + age + ", hometown=" + hometown + ", salary=" + salary
                + ", bonus=" + bonus + ", penaty=" + penaty + "]";
    }
}
