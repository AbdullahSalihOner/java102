public class Main {
    public static void main(String[] args) {

        Student std1 =  new Student("Ali","Veli","1","a",85);
        Student std2 =  new Student("Abi","Veli","1","a",85);
        Student std3 =  new Student("Ebi","Veli","1","a",85);

        Instructor teacher = new Instructor("Mahmut","Sal","Ceng");

        // Course has a Instructor (Composition)
        Course math = new Course("Cal101","Calculus",teacher);

        System.out.println(math.getInstructor().getName());
    }

}
