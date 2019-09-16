package com.vocabulary.en.learning.model.vocabulary.example;

import com.vocabulary.en.learning.model.vocabulary.EnUaVocabulary;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class ExampleEn {

    @Id
    @GeneratedValue
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String example;

    @OneToMany(mappedBy = "exampleEn", fetch = FetchType.EAGER)
    private Set<EnUaVocabulary > enUaVocabularies;


}
