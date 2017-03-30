package com.hlq.domain;

/**
 * Created by heliqing on 2016/10/18.
 * 图书的属性
 */
public class Book {
    long id;
    String bookName;     //图书名字
    String author;        //图书坐着
    float bookPrice;    //图书价格
    String bookNo;       //图书编号
    String editor;       //出版社
    String status;   //图书状态

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookNo='" + bookNo + '\'' +
                ", editor='" + editor + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
