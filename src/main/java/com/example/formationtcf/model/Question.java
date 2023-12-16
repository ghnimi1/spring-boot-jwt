package com.example.formationtcf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "options", joinColumns = @JoinColumn(name = "question_id"))
    @Enumerated(EnumType.STRING)
    private Set<Option> options = new HashSet<>();
    private String correct;
}
