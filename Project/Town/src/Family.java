
public class Family extends Person {

    private int houseNumber;
    private int memberHouse;

    public Family(String name, int age, String job, String pasport , int houseNumber, int memberHouse) {
        super(name, age, job, pasport);
        this.houseNumber = houseNumber;
        this.memberHouse = memberHouse;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getMemberHouse() {
        return memberHouse;
    }

    public void setMemberHouse(int memberHouse) {
        this.memberHouse = memberHouse;
    }

    @Override
    public String toString() {
        
        return "Family{" +
        "memberHouse='" + memberHouse + '\'' +
        ", houseNumber='" + houseNumber + '\'' +
        ", name=" + name +
        ", age='" + age + '\'' +
        ", job='" + job + '\'' +  ", pasport='" + pasport + '\'' +
        '}';
    }

}
