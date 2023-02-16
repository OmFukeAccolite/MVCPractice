package com.example.movie.repository;

import com.example.movie.model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieModel,Long> {


}
