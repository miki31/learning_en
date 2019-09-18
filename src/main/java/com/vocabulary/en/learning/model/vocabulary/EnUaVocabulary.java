package com.vocabulary.en.learning.model.vocabulary;

import com.vocabulary.en.learning.model.vocabulary.en.WordEn;
import com.vocabulary.en.learning.model.vocabulary.example.ExampleEn;
import com.vocabulary.en.learning.model.vocabulary.ua.WordUa;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class EnUaVocabulary {

    @Id
    @GeneratedValue
    private Long id;
    private int page;

    @ManyToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "word_en_id", nullable = false)
    private WordEn wordEn;

    @ManyToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "word_ua_id", nullable = false)
    private WordUa wordUa;

    @ManyToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "example_en_id", nullable = false)
    private ExampleEn exampleEn;


}
