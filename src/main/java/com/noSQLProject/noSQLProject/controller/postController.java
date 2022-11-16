package com.noSQLProject.noSQLProject.controller;


import com.noSQLProject.noSQLProject.repo.postRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.noSQLProject.noSQLProject.model.post;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class postController {

    @Autowired
    private postRepo postsrepo;

    @GetMapping("/posts")
    public List getPosts() {
        //List<post> allPosts = postRepo.findAll();
        List<post> allpost = postsrepo.findAll();
        return  allpost;
    }

    @PostMapping("/posts")
    public post addpost(@RequestBody post postadded){return postsrepo.save(postadded); }
}
