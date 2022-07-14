package com.springprofessional.springpro.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Course  {
    @Id
    long Id;
    String title;
    String description;


    public Course(String title, String description, long Id) {
        this.title = title;
        this.description = description;
        this.Id = Id;
    }

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", Description='" + description + '\'' +
                ", Id=" + Id +
                '}';
    }
}
