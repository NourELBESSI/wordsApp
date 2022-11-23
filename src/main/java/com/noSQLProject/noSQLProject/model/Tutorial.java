package com.noSQLProject.noSQLProject.model;
import javax.persistence.*;


@Entity
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String tutorialType;

    @Lob
    private String content ;

    public Tutorial() {
    }

    public Tutorial(int id, String title, String tutorialType, String content) {
        this.id = id;
        this.title = title;
        this.tutorialType = tutorialType;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTutorialType() {
        return tutorialType;
    }

    public void setTutorialType(String tutorialType) {
        this.tutorialType = tutorialType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
