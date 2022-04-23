package com.chuck.repository;

import java.util.List;

import com.chuck.model.Joke;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JokeRepository extends JpaRepository<Joke, Long>{
    List<Joke> findByPublished(boolean published);
    List<Joke> findByTitleContaining(String title);
}
