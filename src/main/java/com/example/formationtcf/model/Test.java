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
@AllArgsConstructor
@NoArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
   // private List<Question> questions;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "questions", joinColumns = @JoinColumn(name = "test_id"))
    @Enumerated(EnumType.STRING)
    private Set<Question> questions = new HashSet<>();
}

