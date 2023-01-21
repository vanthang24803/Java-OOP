public class Card extends Student{
    private String id;
    private int brrowDate;
    private int paymentDate;
    private int bookId;

    public Card(String name ,int age ,String school, String id, int brrowDate, int paymentDate, int bookId) {
        super(name, age, school);
        this.id = id;
        this.brrowDate = brrowDate;
        this.paymentDate = paymentDate;
        this.bookId = bookId;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBrrowDate() {
        return brrowDate;
    }

    public void setBrrowDate(int brrowDate) {
        this.brrowDate = brrowDate;
    }

    public int getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


    @Override
    public String toString() {
        return "Card [id=" + id + ", brrowDate=" + brrowDate + ", paymentDate=" + paymentDate + ", bookId=" + bookId
                + "]";
    }

   
}
