package com.vocabulary.en.learning.model.vocabulary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Stage {

    @Id
    @GeneratedValue
    private int id;
    private int stage;
    private int lessonFrom;
    private int lessonTo;
}
