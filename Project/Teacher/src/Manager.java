import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Teacher> teachers;

    public Manager() {
        this.teachers = new ArrayList<Teacher>();
    }

    // Add teacher to list

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    // Remove teacher from list by Id

    public boolean removeTeacher(String id) {
        Teacher teacher = this.teachers.stream()
                .filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher != null) {
            this.teachers.remove(teacher);
            return true;
        } else {
            return false;
        }
    }

    // Get Salary teacher by id

    public double getSalary(String id) {
        Teacher teacher = this.teachers.stream()
                .filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher != null) {
            return teacher.getSalary() + teacher.getBonus() + teacher.getPenaty();
        } else {
            System.err.println("Error!");
            return 0;
        }
    }

    // display 

    public void display(){
        this.teachers.forEach(t ->System.out.println(t.toString())); 
    }

}
