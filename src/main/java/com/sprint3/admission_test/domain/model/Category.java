package com.sprint3.admission_test.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 50, unique = true)
    private String name;
}

//getters
public Long getId() {
    return id;
}

public String getName() {
    return name;
}

//Setters
public void setId(Long id) {
    this.id = id;
}

public void setName(String name) {
    this.name = name
}
