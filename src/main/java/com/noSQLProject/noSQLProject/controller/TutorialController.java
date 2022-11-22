package com.noSQLProject.noSQLProject.controller;


import com.noSQLProject.noSQLProject.model.Post;
import com.noSQLProject.noSQLProject.model.Tutorial;
import com.noSQLProject.noSQLProject.repo.PostRepo;
import com.noSQLProject.noSQLProject.repo.TutorialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TutorialController {
    @Autowired
    private TutorialRepo tutorialRepo;

    @GetMapping("/tutorials")
    public List getTutorials() {
        //List<post> allPosts = postRepo.findAll();
        List<Tutorial> alltutorials = tutorialRepo.findAll();
        return  alltutorials;
    }

    @PostMapping("/tutorials")
    public Tutorial addTutorial(@RequestBody Tutorial tutorialadded){return tutorialRepo.save(tutorialadded); }
}
