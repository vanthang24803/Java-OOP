public class Document {
    protected String id;
    protected String nxb;
    protected int number;

    public Document(String id, String nxb, int number) {
        this.id = id;
        this.nxb = nxb;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
}
