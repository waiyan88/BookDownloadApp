package wy.chris.bookdownload;

public class BookModels {

    public String imageLink;
    public String bookname;
    public String author;
    public int downloadcount;

    public BookModels(String imageLink, String bookname, String author, int downloadcount) {
        this.imageLink = imageLink;
        this.bookname = bookname;
        this.author = author;
        this.downloadcount = downloadcount;
    }

    public BookModels() {
    }
}
