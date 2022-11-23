package com.noSQLProject.noSQLProject.controller;


import com.noSQLProject.noSQLProject.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.noSQLProject.noSQLProject.model.Post;


import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PostController {

    @Autowired
    private PostRepo postsrepo;

    @GetMapping("/posts")
    public List getPosts() {
        //List<post> allPosts = postRepo.findAll();
        List<Post> allpost = postsrepo.findAll();
        return  allpost;
    }

    @PostMapping("/posts")
    public Post addpost(@RequestBody Post postadded){return postsrepo.save(postadded); }
}
