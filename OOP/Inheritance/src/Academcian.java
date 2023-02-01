public class Academcian extends Personal {
    private  String department;
    private  String title;

    public Academcian(String nameSurname, String phoneNumber, String email, String department, String title) {
        super(nameSurname, phoneNumber, email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void giveLecture(){
        System.out.println(this.getNameSurname() + " enter the lecture !");
    }



}
