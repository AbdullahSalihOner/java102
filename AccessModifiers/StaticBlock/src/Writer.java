public class Writer {

    final double PI= 3.14;


    private String name;
    private  String surname;

    public  Writer(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public  String getName(){
        return  name;
    }

    public String getSurname(){
        return  surname;
    }

    public  String  getInfo(){
        return  this.name + " " +this.surname;
    }
}
