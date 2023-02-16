package com.example.movie.service;

import com.example.movie.model.MovieModel;
import com.example.movie.repository.MovieRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;


    @Override
    public MovieModel addMovie(MovieModel movieModel) {

        return movieRepository.save(movieModel);
    }

    @Override
    public MovieModel updateMovie(MovieModel movie) {

        Optional<MovieModel> mObj = movieRepository.findById(movie.getMovieId());
        MovieModel m = mObj.get();
        m.setMovieName(movie.getMovieName());
        m.setMoviePrice(movie.getMoviePrice());


        return this.movieRepository.save(m);
    }

    @Override
    public MovieModel getMovieById(long id) {
        Optional<MovieModel> mObj = movieRepository.findById(id);
        return mObj.get();

    }

    @Override
    public List<MovieModel> getAllMovie() {

        return this.movieRepository.findAll();
    }

    @Override
    public void deleteMovie(long id) {

        Optional<MovieModel> mObj = this.movieRepository.findById(id);
        this.movieRepository.deleteById(id);

    }
}
