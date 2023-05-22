public class Book implements Printable{
    private String bookName;
    private String bookAuthor;
    public Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }
    public void setBookName() {
        this.bookName = bookName;
    }
    public String getBookName() {
        return this.bookName;
    }
    public void setBookAuthor() {
        this.bookAuthor = bookAuthor;
    }
    public String getBookAuthor() {
        return this.bookAuthor;
    }
    @Override
    public void print() {
        System.out.println(bookName);
    }
    public static void printBooks(Printable[] printable) {
        for (Printable arrayElement : printable) {
            if (arrayElement instanceof Book) {
                arrayElement.print();
            }
        }
    }
}
