public class CandidateB extends Candidate {

    public static final String Math = "Math";
    public static final String Chemistry = "Chemistry";
    public static final String Biological = "Biological";

    public CandidateB(String id, String name, String address, int priority) {
        super(id, name, address, priority);

    }

    @Override
    public String toString() {
        
        return "CandidateB{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", priority=" + priority + ", Subject: " + Math + " - " + Chemistry + " - " + Biological +
        '}';
    }

}
