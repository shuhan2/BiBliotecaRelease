package com.twu.biblioteca.Entity;

public class MovieEntity {
    private Integer movieId;
    private String movieName;
    private Integer year;
    private String director;
    private Integer movieRating;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(Integer movieRating) {
        this.movieRating = movieRating;
    }
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public MovieEntity(){

    }
    public MovieEntity(Integer movieId,String movieName, Integer year, String director, Integer movieRating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }
}
