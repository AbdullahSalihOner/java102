public class Main {
    public static void main(String[] args) {

        Personal p1 = new Personal("James Car","123456","james@car.com");

        Academcian a1 = new Academcian("Jenifer Apple","321654","jenifer@apple.com","engineering","Prof");
        Officer o1 = new Officer("Joseph J", "145632","joseph@h.com","engineering","morning");

        Instructor i1 = new Instructor("Donald T","1254136","donald@t.com","engineering","prof","3");

        o1.entry();
        i1.giveLecture();
        System.out.println(i1.getDoorNo());
    }
}
