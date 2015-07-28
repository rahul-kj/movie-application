package io.rahul.movie.reviews.controllers;

import io.rahul.movie.reviews.domain.Likes;
import io.rahul.movie.reviews.repositories.LikesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LikesController {

    @Autowired
    LikesRepository likesRepository;

    @RequestMapping(value = "/likes", method = RequestMethod.GET)
    public Iterable<Likes> likes() {
        return likesRepository.findAll();
    }
}
