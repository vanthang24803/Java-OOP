public class Newpaper extends Document{
    
    private int dayIssue;

    public Newpaper(String id, String nxb, int number , int dayIssue) {
        super(id, nxb, number);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
        "dayIssue=" + dayIssue +
        ", id='" + id + '\'' +
        ", nxb='" + nxb + '\'' +
        ", number='" + number + '\'' +
        '}';
    }
    
}
