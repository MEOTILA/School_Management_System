package org.example.base.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity<ID extends Serializable> {
    private ID id;

}
