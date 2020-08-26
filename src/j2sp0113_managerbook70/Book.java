/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2sp0113_managerbook70;

/**
 *
 * @author PhongFPT
 */
public class Book {
    String bookCode,bookName,authorName,publisherName, publishedYear;
    boolean forRent;

    public Book(String bookCode, String bookName, String authorName, String publisherName, String publishedYear, boolean forRent) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.publishedYear = publishedYear;
        this.forRent = forRent;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public boolean isForRent() {
        return forRent;
    }

    public void setForRent(boolean forRent) {
        this.forRent = forRent;
    }

    @Override
    public String toString() {
        return "Student{" + "bookCode=" + bookCode + ", bookName=" + bookName + ", authorName=" + authorName + ", publisherName=" + publisherName + ", publishedYear=" + publishedYear + ", forRent=" + forRent + '}';
    }
    
}
