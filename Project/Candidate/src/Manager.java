import java.util.ArrayList;
import java.util.List;

public class Manager {

    List<Candidate> candidates;

    public Manager(){
        this.candidates = new ArrayList<>();
    }

    //Add a new candidate

    public void addCandidate(Candidate candidate) {
        this.candidates.add(candidate);
    }

    //Show Infor

    public void showInfor(){
        this.candidates.forEach(candidate -> System.out.println(candidate.toString()));
    }

    //Search By Id

    public Candidate searchById(String id){
        return this.candidates.stream()
        .filter(candidate -> candidate.getId().equals(id)).findFirst().orElse(null);
    }

}

