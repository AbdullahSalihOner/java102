public class Book {
    private int pageCount;
    private String bookName, author;

    Book (String  bookName,int pageCount,String author){
        this.bookName = bookName;
        this.author = author;
        if (pageCount < 1)
        {
            this.pageCount = 10;
        }else {
            this.pageCount = pageCount;
        }
    }

    public int getPageCount(){
        return this.pageCount;
    }
    public  void setPageCount(int pageCount){
        if (pageCount < 1){
            this.pageCount = 10;
        }else {
            this.pageCount = pageCount;
        }
    }

    public String getBookName(){
        return this.bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }
}
