package com.example.movie.controller;

import com.example.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.movie.model.MovieModel;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movie")
    private ResponseEntity<List<MovieModel>> getAllMovies(){
        System.out.println("FROM GET REQUEST.......");

        return ResponseEntity.ok().body(this.movieService.getAllMovie());
    }

    @GetMapping("/movie/{movieId}")
    private MovieModel getProductById(@PathVariable Long productId){
        return this.movieService.getMovieById(productId);

    }

    @PostMapping("/movies")
    private ResponseEntity<MovieModel> saveProduct(@RequestBody MovieModel movie){

        return ResponseEntity.ok().body(this.movieService.addMovie(movie));

    }

    @PutMapping("/movies/{movieId}")
    private ResponseEntity<MovieModel> updateProduct(@RequestBody MovieModel movie,@PathVariable Long movieId){

        movie.setMovieId(movieId);
        return ResponseEntity.ok().body(this.movieService.updateMovie(movie));
    }

    @DeleteMapping("/movie/{movieId}")
    private HttpStatus deleteProduct(@PathVariable Long movieId){
        this.movieService.deleteMovie(movieId);
        return HttpStatus.OK;
    }


}
