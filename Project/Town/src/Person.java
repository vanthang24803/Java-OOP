public class Person {
    protected String name;
    protected int age;
    protected String job;
    protected String pasport;

    public Person(String name, int age, String job, String pasport) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.pasport = pasport;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPasport() {
        return pasport;
    }

    public void setPasport(String pasport) {
        this.pasport = pasport;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", pasport='" + pasport + '\'' +
                '}';
    }
}
