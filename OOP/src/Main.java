public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Anna Karaninna",1000,"LevTolstoy");

        System.out.println(book1.getPageCount());
        book1.setPageCount(952);
        System.out.println(book1.getPageCount());

        System.out.println(book1.getBookName());



    }
}
