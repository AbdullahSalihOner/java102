public class Personal {

    private String nameSurname;
    private String phoneNumber;
    private String email;

    public Personal(String nameSurname, String phoneNumber, String email) {
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void entry(){
        System.out.println(this.nameSurname + " enter the University");
    }

    public void exit(){
        System.out.println(this.nameSurname + " exit the University");
    }

    public void refectory(){
        System.out.println(this.nameSurname + " enter the refectory ! !");
    }

}
