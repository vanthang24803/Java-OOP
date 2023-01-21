public class Journal  extends Document{

    private int issueNumber;
    private int monthIssue;

    public Journal(String id, String nxb, int number , int issueNumber, int monthIssue) {
        super(id, nxb, number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getissueNumber() {
        return issueNumber;
    }

    public void setissueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    @Override
    public String toString() {
        return "Journal{" +
        "issueNumber=" + issueNumber +
        ", monthIssue=" + monthIssue +
        ", id='" + id + '\'' +
        ", nxb='" + nxb + '\'' +
        ", number='" + number + '\'' +
        '}';
    }
    
}
