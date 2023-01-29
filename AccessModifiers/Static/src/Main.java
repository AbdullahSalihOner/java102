public class Main {
    public static void main(String[] args){

        Course math = new Course("Calculus1","CAL101",100);
        Course physic = new Course("physic1","PHY101",70);
        Course chemical = new Course("Chemical1","CHEM101",50);

        int[] notes = {math.note,physic.note,chemical.note};
        math.calcAverage(notes);

        Course[] lectures = {math,physic,chemical};
        // We can use static method directly
        Calculate.calcAverage(lectures);




    }
}
