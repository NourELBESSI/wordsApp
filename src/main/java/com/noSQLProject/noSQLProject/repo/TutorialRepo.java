package com.noSQLProject.noSQLProject.repo;


import com.noSQLProject.noSQLProject.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepo extends JpaRepository<Tutorial,Integer> {
}
