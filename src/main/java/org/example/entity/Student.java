package org.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.base.model.BaseEntity;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@ToString(exclude = "enrollments")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Student extends BaseEntity<Long> {

    @NotBlank
    @Column(nullable = false)
    String name;

    @Email
    @NotBlank
    @Column(nullable = false, unique = true)
    String email;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Enrollment> enrollments;


}