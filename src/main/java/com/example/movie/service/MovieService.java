package com.example.movie.service;

import com.example.movie.model.MovieModel;

import java.util.List;

public interface MovieService {



    MovieModel addMovie(MovieModel movieModel);

    MovieModel updateMovie(MovieModel movieModel);

    MovieModel getMovieById(long id);

    List<MovieModel> getAllMovie();

    void deleteMovie(long id);


}
