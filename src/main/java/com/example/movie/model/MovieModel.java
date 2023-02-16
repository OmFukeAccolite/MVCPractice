package com.example.movie.model;


import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class MovieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long movieId;

    @Column(name = "movieName")
    private String movieName;

    @Column(name = "moviePrice")
    private int moviePrice;

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMoviePrice(int moviePrice) {
        this.moviePrice = moviePrice;
    }

    public long getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMoviePrice() {
        return moviePrice;
    }
}
