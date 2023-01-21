public class CandidateA extends Candidate{

    public static final String Math = "Math";
    public static final String Physics = "Physics";
    public static final String Chemistry = "Chemistry";


    public CandidateA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
        
    }

    @Override
    public String toString() {
        
        return "CandidateA{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", priority=" + priority + ", Subject: " + Math + " - " + Physics + " - " + Chemistry +
        '}';
    }
    
}
