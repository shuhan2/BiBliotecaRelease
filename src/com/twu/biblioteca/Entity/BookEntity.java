package com.twu.biblioteca.Entity;

public class BookEntity {
    private Integer id;
    private String bookTitle;
    private String author;
    private String summary;
    private Integer publishYear;
    private Boolean isMoveOut;

    public BookEntity(){

    }
    public BookEntity(Integer id, String bookTitle, String author, String summary, Integer publishYear, Boolean isMoveOut) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.author = author;
        this.summary = summary;
        this.publishYear = publishYear;
        this.isMoveOut = isMoveOut;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public Boolean getIdMoveOut() {
        return isMoveOut;
    }

    public void setIdMoveOut(Boolean idMoveOut) {
        this.isMoveOut = idMoveOut;
    }



}
