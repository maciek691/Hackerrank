package LibraryCatalogueDay11;

public class Book {

    // Global Variables

    String title;
    int pageCount;
    int ISBN;
    boolean isCheckOut;
    int dayCheckedOut = -1;

    //Constructor

    public Book (String bookTitle, int bookPageCount, int bookISBN) {
        this.title=bookTitle;
        this.pageCount=bookPageCount;
        this.ISBN=bookISBN;
        isCheckOut=false;
    }

    // Getters

    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsCheckOut() {
        return this.isCheckOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    // Setters

    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }

}
