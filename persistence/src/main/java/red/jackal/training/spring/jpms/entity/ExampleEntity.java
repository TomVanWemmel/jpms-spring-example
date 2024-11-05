package red.jackal.training.spring.jpms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import red.jackal.training.spring.jpms.api.ExampleData;

import java.io.Serializable;

@Entity
public class ExampleEntity implements ExampleData, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public ExampleEntity() {
        //For JPA
    }

    public ExampleEntity(String name) {
        this.name = name;
    }

    public ExampleEntity(ExampleData exampleData) {
        this(exampleData.name());
    }

    public Long id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

}
