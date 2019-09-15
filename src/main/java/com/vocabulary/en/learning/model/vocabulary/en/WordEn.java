package com.vocabulary.en.learning.model.vocabulary.en;

import com.vocabulary.en.learning.model.vocabulary.EnUaVocabulary;
import com.vocabulary.en.learning.model.vocabulary.Word;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class WordEn extends Word {

    @Id
    @GeneratedValue
    private Long id;
    private String word;

    @OneToMany(mappedBy = "wordEn", fetch = FetchType.EAGER)
    private Set<EnUaVocabulary> enUaVocabularies;

}
