public class Instructor extends Academcian{
    private String  doorNo;

    public Instructor(String nameSurname, String phoneNumber, String email, String department, String title, String doorNo) {
        super(nameSurname, phoneNumber, email, department, title);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
}
