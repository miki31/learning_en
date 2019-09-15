package com.vocabulary.en.learning.model.vocabulary.ua;

import com.vocabulary.en.learning.model.vocabulary.EnUaVocabulary;
import com.vocabulary.en.learning.model.vocabulary.Word;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class WordUa extends Word {

    @Id
    @GeneratedValue
    private Long id;
    private String word;

    @OneToMany(mappedBy = "wordUa", fetch = FetchType.EAGER)
    private Set<EnUaVocabulary> enUaVocabularies;

}
