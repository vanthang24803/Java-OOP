public class CandidateC  extends Candidate{

    public static final String Literature = "Literature";
    public static final String History = "History";
    public static final String Geography = "Geography";

    public CandidateC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateC{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", priority=" + priority + ", Subject: " + Literature + " - " + History + " - " + Geography +
        '}';
    }
    
}
