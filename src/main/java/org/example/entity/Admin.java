package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.base.model.BaseEntity;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Admin extends BaseEntity<Integer> {
    private String firstName;
    private String lastName;

    public Admin(Integer integer, String firstName, String lastName) {
        super(integer);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
