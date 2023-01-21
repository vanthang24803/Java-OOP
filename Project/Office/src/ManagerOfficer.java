import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {
    private List<Officer> officers;

    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }

    // Add member

    public void addOfficer(Officer officer) {
        this.officers.add(officer);
    }

    // Search by name

    public List<Officer> searchOfficerByName(String name) {
        return this.officers.stream().filter(
                o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    // Show

    public void showListOfOfficers(){
        this.officers.forEach(o -> System.out.println(o.toString()));
    }

}
